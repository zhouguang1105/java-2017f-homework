package HuLuBro;

public class Test {
	public static void main(String []args){
		HuLuWa huluwa[]=new HuLuWa[7];
		
		
		huluwa[0]=new HuLuWa("�ϴ�",Color.RED,1);
		huluwa[1]=new HuLuWa("�϶�",Color.ORANGE,2);
		huluwa[2]=new HuLuWa("����",Color.YELLOW,3);
		huluwa[3]=new HuLuWa("����",Color.GREEN,4);
		huluwa[4]=new HuLuWa("����",Color.CHING,5);
		huluwa[5]=new HuLuWa("����",Color.BLUE,6);
		huluwa[6]=new HuLuWa("����",Color.PURPLE,7);
		
		Home home=new Home(huluwa);
		System.out.println("����ǰ��˳��:");
		home.outName();
		System.out.println("������...");
		home.bubbleSort();
		System.out.println("������˳��:");
		home.outName();
		
		home.messUp();
		
		System.out.println("����ǰ��˳��:");
		home.outColor();
		System.out.println("������...");
		home.divideSort();
		System.out.println("������˳��:");
		home.outColor();

	}
}
