/**
 * Created by cbcwe on 2017/9/22.
 * Edited by cbcwe on 2017/9/26
 */
public class Grandpa {
    /**
     * ģ��үүָ�Ӻ�«���ǽ�����������bubbleSort��quickSort�������潻������(report)
     */
    public Grandpa(){
        System.out.println("үү������");
    }

    // ���潻������
    private static void report(GourdDoll gourdDoll,int from , int to ){
        gourdDoll.speakName();
        System.out.println(":"+from+"->"+to);
    }

    // ��������Ķ���ӿ�
    public void quickSort(GourdDoll[] gourddolls) {
        if (gourddolls == null)
            return;
        quickSort(gourddolls, 0, gourddolls.length - 1);
    }

    // ����������ڲ�ѭ��
    private void quickSort(GourdDoll[] gourddolls, int begin, int end) {
        if (begin >= end || gourddolls == null)
            return;
        int p = partition(gourddolls, begin, end);
        quickSort(gourddolls, begin, p - 1);
        quickSort(gourddolls, p + 1, end);
    }

    // ���������paritition����
    private static int partition(GourdDoll[] gourddolls, int begin, int end) {
        GourdDoll first = gourddolls[begin];
        int i = begin, j = end;
        while (i < j) {
            while (gourddolls[i].getRank() <= first.getRank() && i < end) {
                i++;
            }
            while (gourddolls[j].getRank() > first.getRank() && j >= begin) {
                j--;
            }
            if (i < j) {
                report(gourddolls[i],i,j);
                report(gourddolls[j],j,i);
                GourdDoll.swap(gourddolls,i,j);
            }
        }
        if (j != begin) {
            report(gourddolls[begin],begin,j);
            report(gourddolls[j],j,begin);
            GourdDoll.swap(gourddolls,begin,j);
        }
        return j;
    }

    // ð������Ķ���ӿ�
    public void bubbleSort(GourdDoll[] gourdDolls){
        for( int i = gourdDolls.length - 1  ; i > 0  ; -- i )
            for(int j = 0 ; j < i ; ++ j ){
                if( gourdDolls[j].getRank() > gourdDolls[j+1].getRank() ){
                    report(gourdDolls[j],j,j+1);
                    report(gourdDolls[j+1],j+1,j);
                    GourdDoll.swap(gourdDolls,j,j+1);
                }
            }
    }


}
