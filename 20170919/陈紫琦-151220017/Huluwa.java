enum Color
{
    RED("�ϴ�","��ɫ",1), ORANGE("�϶�", "��ɫ",2), YELLOW("����", "��ɫ",3), GREEN("����","��ɫ",4),
    CYAN("����","��ɫ",5), BLUE("����", "��ɫ", 6), PURPLE("����", "��ɫ", 7);
    private String NoName; //��X
    private String ColorName; //��ɫ
    private int index; //���
    private Color(String NoName, String ColorName, int index) //���캯��
    {
        this.NoName = NoName;
        this.ColorName = ColorName;
        this.index = index;
    }
    public  String getNoName()
    {
        return NoName;
    }
    public String getColorName()
    {
        return  ColorName;
    }
    public int getColorIndex() {return index;}
}
public class Huluwa
{
    Color color;
    int index;
    Huluwa(int index)
    {
        this.index = index;
        switch (index)
        {
            case 1: color = Color.RED; break;
            case 2: color = Color.ORANGE; break;
            case 3: color = Color.YELLOW; break;
            case 4: color = Color.GREEN; break;
            case 5: color = Color.CYAN; break;
            case 6: color = Color.BLUE; break;
            case 7: color = Color.PURPLE; break;
        }
    }
    public void reportNumber() //����
    {
        System.out.print(color.getNoName() + " ");
    }
    public void reportColor() //������
    {
        System.out.print(color.getColorName() + " ");
    }
    public void JumpandReport(HuluwaBrothers queue, int a, int b) //�ƶ�λ�ò�����
    {
        queue.positions[b].holder = this;
        a++; b++;
        System.out.println("\t" + color.getNoName() + ":" + a + "->"+ b);
    }
}