
/*======�ϵ�֮��========*/
public class RunGame {
	public static void main(String[] args){
		GourdDollGroup game =new GourdDollGroup();
		game.DollsBorn();
		System.out.println("=====ð������֮ǰ������=======");
		game.SayOrder();	
		System.out.println();	
		System.out.println("=====��ʼ����=======");
		game.BubbleSort();
		System.out.println("=====ð������֮������=======");
		game.SayOrder();
		System.out.println();
		System.out.println();
		game.DollsBorn();
		System.out.println("=====��������֮ǰ����ɫ=======");
		game.SayColor();
		System.out.println();
		System.out.println("=====��ʼ����=======");
		game.quickSort();
		System.out.println("=====��������֮����ɫ=======");
		game.SayColor();
		
	}
	
}
