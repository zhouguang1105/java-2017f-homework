package sorting_Calabashboys;

//��«�ٵ��࣬���ڷ��ú�«�޺ͽ����������
public class Calabash_vine extends Calabash_boy {

private
	//һ�������߸���
	Calabash_boy []Vine = new Calabash_boy[7];

	//�����ϵ�������«����
	void Exchange_pos(int i, int j) {
		Calabash_boy temp = new Calabash_boy();
		temp = Vine[i];
		Vine[i] = Vine[j];
		Vine[j] = temp;
	}
	
public	
	//���캯��,����«�޷��õ���«�ٶ�Ӧ��λ����
	Calabash_vine(){	
		Vine[0] = new Calabash_boy(Color.Red, 1);
		Vine[1] = new Calabash_boy(Color.Orange, 2);
		Vine[2] = new Calabash_boy(Color.Yellow, 3);
		Vine[3] = new Calabash_boy(Color.Green, 4);
		Vine[4] = new Calabash_boy(Color.Cyan, 5);
		Vine[5] = new Calabash_boy(Color.Blue, 6);
		Vine[6] = new Calabash_boy(Color.Purple, 7);
	}
	
	
	//����ǰ�����߸���«����
	void Before_sorting() {
		Vine[0].Set_color(Color.Cyan);
		Vine[1].Set_color(Color.Purple);	
		Vine[2].Set_color(Color.Orange);	
		Vine[3].Set_color(Color.Blue);	
		Vine[4].Set_color(Color.Red);	
		Vine[5].Set_color(Color.Green);	
		Vine[6].Set_color(Color.Yellow);	
		System.out.print("����ǰ:");
		Report_color_by_pos();
	}
	
	
	//��«���ϴ����Ұ���ɫ����
	void Report_color_by_pos() {
		for(int i = 0;i < 7;i++) {
			System.out.print(Vine[i].Report_color_string());
			if(i < 6)
				System.out.print(", ");
		}
		System.out.println(" ");
	}
	
	
	//������ð������
	void Bubble_sort_rank() {
		System.out.println("ð������ʼ:");
		for(int i = 0;i < Vine.length-2;i++) {
			for(int j = Vine.length-1; j > i;j--) {
				if(Vine[j].Return_rank() < Vine[j-1].Return_rank()) {
					Exchange_pos(j, j-1);
					System.out.print(Vine[j-1].Report_rank_string() + ": " + (j+1) + "->" + j + ", ");
					System.out.print(Vine[j].Report_rank_string() + ": " + j + "->" + (j+1) + "  ;  ");
				}
			}
			System.out.println(" ");
		}
		System.out.println("ð���������");
	}
	
	
	//����ɫ��������
	void TwoHalf_Sorting_color() {
		System.out.println("��������ʼ��");
		
		for(int i = 1;i < Vine.length;i++) {
			int first = 0;int last = i-1;
			
			while(first <= last) {
				int mid = (first+last)/2;
				if(Vine[mid].Return_col().ordinal() < Vine[i].Return_col().ordinal())
					first = mid+1;
				else
					last = mid-1;
			}
			//�ҵ�λ��
			
			Calabash_boy temp = Vine[i];
			for(int j = i - 1;j > last;j--) {
				Vine[j+1] = Vine[j];
				System.out.print(Vine[j+1].Report_rank_string() + ": " + (j+1) + "->" + (j+2) + ", ");
			}
			Vine[last+1] = temp;
			//���������Ӧλ��
			
			System.out.println(temp.Report_rank_string() + ": " + (i+1) + "->" + (last+2));
		}
		System.out.println("�����������");
	}
}
