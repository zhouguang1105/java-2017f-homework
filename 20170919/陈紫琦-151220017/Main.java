public class Main
{
    public static void main(String[]args)
    {
        HuluwaBrothers huluwaBrothers = new HuluwaBrothers();
        huluwaBrothers.Initialize();
        /*ð������*/
        System.out.println("��һ������վ�ӣ�");
        huluwaBrothers.LineUpRandomly();//����վ��
        System.out.print("\t������");
        huluwaBrothers.ReportNumbers(); //����
        System.out.println("ð��������̣�");
        huluwaBrothers.BubbleSort();//ð������
        System.out.println("ð�������");
        System.out.print("\t������");
        huluwaBrothers.ReportNumbers(); //����
        System.out.println();

        /*��������*/
        System.out.println("�ڶ�������վ�ӣ�");
        huluwaBrothers.LineUpRandomly();//����վ��
        System.out.print("\t����ɫ��");
        huluwaBrothers.ReportColors(); //����ɫ
        System.out.println("����������̣�");
        huluwaBrothers.QuickSort(0, 6); //��������
        System.out.println("���������");
        System.out.print("\t����ɫ��");
        huluwaBrothers.ReportColors(); //����ɫ
    }
}