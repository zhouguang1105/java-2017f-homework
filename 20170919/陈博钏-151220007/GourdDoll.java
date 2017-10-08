/**
 * Created by cbcwe on 2017/9/22.
 * Edited by cbcwe on 2017/9/26
 */
public class GourdDoll {
    /***
     * ģ��һ����«��
     * name:��«�޵�����
     * rank:0������ޣ�1����2�ޣ��Դ�����
     */
    private String name;
    private int rank;

    // ��ȡ��«�޵�����
    public int getRank(){
        return rank;
    }

    // ��ȡ��«�޵�����
    public String getName(){
        return name;
    }

    public GourdDoll(int new_value) {
        rank = new_value;
        rank %= 7;
        switch (rank) {
            case 0:
                name = "����";
                break;
            case 1:
                name = "����";
                break;
            case 2:
                name = "����";
                break;
            case 3:
                name = "����";
                break;
            case 4:
                name = "����";
                break;
            case 5:
                name = "����";
                break;
            case 6:
                name = "����";
                break;
            default:
                name = "˭�ҵĺ���?";
        }
        System.out.println(name+"������");
    }

    // ������«�޵�����
    public void speakName(){
        System.out.print(name+" ");
    }

    // ������«�޵�����
    public void speakRank(){
        switch(rank){
            case 0:
                System.out.print("�ϴ� ");
                break;
            case 1:
                System.out.print("�϶� ");
                break;
            case 2:
                System.out.print("���� ");
                break;
            case 3:
                System.out.print("���� ");
                break;
            case 4:
                System.out.print("���� ");
                break;
            case 5:
                System.out.print("���� ");
                break;
            case 6:
                System.out.print("���� ");
                break;
            default:
                System.out.print("үүʲôʱ���ժ�˸���«�� ");

        }
    }

    // ��̬����������GourdDoll���������Ԫ�ص�ֵ�����Ѻ�«��a�ͺ�«��b����λ��
    public static void swap(GourdDoll []gourdDoll , int a , int b){
        GourdDoll tmp = gourdDoll[a];
        gourdDoll[a] = gourdDoll[b];
        gourdDoll[b] = tmp;
    }
}
