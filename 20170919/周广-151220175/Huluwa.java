public class Huluwa {
    private int no;
    private String name;
    private String color;

    Huluwa(int no){
        this.no = no;
        switch(no) {
            case 1:
                this.color = "红色";
                this.name = "大娃";
                break;

            case 2:
                this.color = "橙色";
                this.name = "二娃";
                break;

            case 3:
                this.color = "黄色";
                this.name = "三娃";
                break;

            case 4:
                this.color = "绿色";
                this.name = "四娃";
                break;

            case 5:
                this.color = "青色";
                this.name = "五娃";
                break;

            case 6:
                this.color = "蓝色";
                this.name = "六娃";
                break;

            case 7:
                this.color = "紫色";
                this.name = "七娃";
                break;


        }
    }

    String get_name() {
        return name;
    }

    String get_color() {
        return color;
    }

    int get_no(){
        return no;
    }

    void set_no(int no){
        this.no = no;
    }

    void report_position(int i, int j){
        System.out.println(name +  ": " +  j + "->" + i);
    }

}

