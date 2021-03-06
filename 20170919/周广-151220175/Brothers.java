import java.util.Random;

public class Brothers {
     Huluwa[] brothers;
     Brothers(){
         //初始化葫芦兄弟
         brothers = new Huluwa[7];
         for(int i=0; i<7; i++)
             brothers[i] = new Huluwa(i+1);
     }
     void random_queue(){
        Random random = new Random();
        for(int i = 0; i < 20; i ++){
            int a = random.nextInt(7);
            int b = random.nextInt(7);
            Huluwa temp = brothers[a];
            brothers[a] = brothers[b];
            brothers[b] = temp;
        }
         System.out.println("随意站队情况：");
    }

    void bubble_sort(){
        for(int i = 0; i < 7; i ++)
            for(int j = 0; j < 6; j ++)
                if(brothers[i].get_no() < brothers[j].get_no()) {
                    Huluwa temp = brothers[i];
                    brothers[i] = brothers[j];
                    brothers[j] = temp;
                    brothers[i].report_position(i,j);
                    brothers[j].report_position(j,i);
                }
    }

    void quick_sort(int low, int high){
        if(low >= high)
            return;
        int first = low;
        int last = high;
        int key = brothers[first].get_no();

        while(first < last){
            while(first < last && brothers[last].get_no() >= key)
               last --;
            if(first < last) {
                Huluwa temp = brothers[first];
                brothers[first] = brothers[last];
                brothers[last] = temp;
                brothers[first].report_position(first, last);
                brothers[last].report_position(last, first);
            }
            while(first < last && brothers[first].get_no() <= key)
                first ++;
            if(first < last) {
                Huluwa temp = brothers[first];
                brothers[first] = brothers[last];
                brothers[last] = temp;
                brothers[first].report_position(first, last);
                brothers[last].report_position(last, first);
            }
        }

        brothers[first].set_no(key);
        quick_sort(low,first-1);
        quick_sort(first+1, high);

    }

    void print_name(){
        for(int i = 0; i < 7; i ++)
            System.out.print(brothers[i].get_name() + " ");
        System.out.println();
    }

    void print_color(){
        for(int i = 0; i < 7; i ++)
            System.out.print(brothers[i].get_color() + " ");
        System.out.println();
    }

    public static void main(String []args){
        Brothers huluwa = new Brothers();

        //冒泡排序
        huluwa.random_queue();  //随机站队
        huluwa.print_name();    //站队情况
        huluwa.bubble_sort();   //冒泡排序
        huluwa.print_name();    //报告名字

        System.out.println();

        //快速排序
        huluwa.random_queue();  //随机站队
        huluwa.print_color();    //站队情况
        huluwa.quick_sort(0,6);     //快速排序
        huluwa.print_color();   //报告颜色

    }

}
