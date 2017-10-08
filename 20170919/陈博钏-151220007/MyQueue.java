/**
 * Created by cbcwe on 2017/9/22.
 * Edited by cbcwe on 2017/9/26
 */

public class MyQueue {
    /**
     * ģ����үү���߸���«�޵��������
     */

    public static void main(String[] args){

        Grandpa grandpa;
        GourdDoll[] gourddoll;
        grandpa = new Grandpa();
        gourddoll = new GourdDoll[7];
        // үү���«�޵ĳ�ʼ��
        for (int i = 0; i < 7; ++i) {
            GourdDoll temp = new GourdDoll(i);
            gourddoll[i] = temp;
        }

        // ð������
        getRandomArray(gourddoll);
        System.out.print("\n����վ��:");
        showRank(gourddoll);
        grandpa.bubbleSort(gourddoll);
        System.out.print("������ð�������");
        showRank(gourddoll);

        // ��������
        getRandomArray(gourddoll);
        System.out.print("\n\n����վ��:");
        showName(gourddoll);
        grandpa.quickSort(gourddoll);
        System.out.print("����ɫ���������");
        showName(gourddoll);
    }

    // չʾ��«�޵�����
    private static void showName(GourdDoll[] gourdDolls) {
        for (int i = 0; i <= 6; ++i)
            gourdDolls[i].speakName();
        System.out.print('\n');
    }

    // չʾ��«�޵�����
    private static void showRank(GourdDoll[] gourdDolls) {
        for (int i = 0; i <= 6; ++i)
            gourdDolls[i].speakRank();
        System.out.print('\n');
    }

    // Ϊ��«�޴����Ŷ�˳��
    private static void getRandomArray(GourdDoll[] gourddoll) {

        for (int i = 0; i <= 6; ++i) {
            int j = (int) (System.currentTimeMillis() % 7);
            GourdDoll temp = gourddoll[i];
            gourddoll[i] = gourddoll[j];
            gourddoll[j] = temp;
        }
    }
}
