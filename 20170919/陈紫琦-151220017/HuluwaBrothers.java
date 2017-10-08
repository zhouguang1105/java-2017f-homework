public class HuluwaBrothers //��«���ֵܶ���
{
    public Position[] positions; //һ����λ

    void Initialize() //��ʼ��
    {
        positions = new Position[7];
        int i;
        for (i = 0; i < 7; i++) {
            positions[i] = new Position();
            positions[i].index = i;
            Huluwa newbrother = new Huluwa(i + 1);
            positions[i].holder = newbrother;
            //BrothersQueue[i].Initialize(i+1); ����д��!! brothers[i]��ʱΪNULL!
        }
    }

    public void LineUpRandomly() //����վ��
    {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6};
        int i, rand;
        for (i = 6; i >= 0; i--) {
            java.util.Random random = new java.util.Random();// ���������
            rand = random.nextInt(i + 1);// ����[0,7)�����е�������ע�ⲻ����7
            if (rand != i) {
                int temp = array[i];
                array[i] = array[rand];
                array[rand] = temp;
            }
        }
        Position[] positionsCopy = new Position[7];
        for (i = 0; i < 7; i++) {
            //System.out.print(array[i] + " ");
            positionsCopy[i] = new Position();
            positionsCopy[i].index = i;
            positionsCopy[i].holder = positions[array[i]].holder; //��«��������
        }
        positions = positionsCopy;
    }

    public void ReportNumbers() //����
    {
        int i;
        for (i = 0; i < 7; i++)
            positions[i].holder.reportNumber(); //ÿ����«�����α���
        System.out.println();
    }

    public void ReportColors() //����ɫ
    {
        int i;
        for (i = 0; i < 7; i++)
            positions[i].holder.reportColor(); //ÿ����«�����α���ɫ
        System.out.println();
    }

    public void BubbleSort() //ð������
    {
        int i, j;
        for (i = 0; i < 7 - 1; i++)
        {
            for (j = 0; j < 7 - 1 - i; j++)
            {
                if (positions[j].holder.index > positions[j + 1].holder.index)
                {
                    Huluwa temp = positions[j].holder;
                    positions[j+1].holder.JumpandReport(this, j+1, j);//�ƶ�λ�ò�����
                    temp.JumpandReport(this, j , j+1);//�ƶ�λ�ò�����
                }
            }
        }
    }
    private int Partition(int low, int high)
    {
        int pivotpos = low;
        Huluwa pivot =  positions[low].holder;
        int i;
        for(i = low + 1; i <= high; i++)
        {
            if( positions[i].holder.color.getColorIndex() < pivot.color.getColorIndex()) //����ɫ����
            {
                pivotpos++;
                if(pivotpos != i)
                {
                    Huluwa temp = positions[i].holder;
                    positions[pivotpos].holder.JumpandReport(this, pivotpos, i);//�ƶ�λ�ò�����
                    temp.JumpandReport(this, i , pivotpos);//�ƶ�λ�ò�����
                }
            }
        }
        if(pivotpos != low)
        {
            Huluwa temp = positions[low].holder;
            positions[pivotpos].holder.JumpandReport(this, pivotpos, low);//�ƶ�λ�ò�����
            temp.JumpandReport(this, low , pivotpos);//�ƶ�λ�ò�����
        }
        return pivotpos;
    }
    public void QuickSort(int left, int right) //��������
    {
        if(left < right)
        {
            int pivotpos = Partition(left, right);
            QuickSort(left, pivotpos - 1);
            QuickSort(pivotpos+1, right);
        }
    }
}

class Position //����λ����
{
    public int index;
    public Huluwa holder;
}