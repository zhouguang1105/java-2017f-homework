//package pack;


public class Hulu {

	
	Rank num;
	Color col;	

	//��ʼ�����������ȷ����ɫ������
	void setHulu(int i)
	{
		switch (i)
		{
		case 1: num=Rank.one;col=Color.red;break;
		case 2:num=Rank.two;col=Color.orange;break;
		case 3:num=Rank.three;col=Color.yellow;break;
		case 4:num=Rank.four;col=Color.green;break;
		case 5:num=Rank.five;col=Color.ching;break;
		case 6:num=Rank.six;col=Color.blue;break;
		default:num=Rank.seven;col=Color.purple;break;
		
			
		}
	}
	
	//��«�޴�����a��������b
	void gotoSeat(Seat a,Seat b)
	{
		tellMove(a.index,b.index);
		b.holder=this;
		
	}
	
	//��֪�ƶ�
	void tellMove(int a,int b) {
			System.out.println(num.name+": "+a+"->"+b);
		
	}
	//�����
	void tellNum()
	{
		System.out.print(num.name+" ");
	}
	//����ɫ
	void tellCol()
	{
		System.out.print(col.name+" ");
	}
	//�õ���ɫ���
	int getColOrd()//
	{
		return col.ordinal();
	}
	//�õ��������
	int getRankOrd()
	{
		return num.ordinal();
	}
	
}


enum Color{
	red("��ɫ"),orange("��ɫ"),yellow("��ɫ"),green("��ɫ"),ching("��ɫ"),blue("��ɫ"),purple("��ɫ");	
	String name;     
    private Color(String name) {  
         this.name = name;        
     }  
}

enum Rank{	
	one("�ϴ�"),two("�϶�"),three("����"),four("����"),five("����"),six("����"),seven("����");
	String name;
	private Rank(String name)
	{
		this.name=name;
	}
}
