package MyHuluSort;

public class MyHuluSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HuluSort mysort = new HuluSort();
		mysort.add(1, "����", "��", 1);
		mysort.add(2, "����", "��", 2);
		mysort.add(3, "����", "��", 3);
		mysort.add(4, "����", "��", 4);
		mysort.add(5, "����", "��", 5);
		mysort.add(6, "����", "��", 6);
		mysort.add(7, "����", "��", 7);
		
		mysort.getrandom(mysort.random_the_Boy());
		mysort.report_AllBoy("name");
		mysort.BubbleSort_AllBoy();
		mysort.report_AllBoy("name");
		
		mysort.getrandom(mysort.random_the_Boy());
		mysort.report_AllBoy("color");
		mysort.DichotomySort_AllBoy();
		mysort.report_AllBoy("color");
	}

}
