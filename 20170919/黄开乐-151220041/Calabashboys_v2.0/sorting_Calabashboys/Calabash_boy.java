package sorting_Calabashboys;

//����һ����«�޵���
public class Calabash_boy {
	public final static int NULL =0;
	
private
	//��«�޵�˽�г�Ա

	Color color;
	int rank;
	
protected	
	//���º������ڷ���˽����Ϣ�������û����ţ�ֻ�������࿪��

	//�ú�«�޷����Լ�����ɫ
	Color Return_col() {
		return color;
	}
	
	//�ú�«�޷����Լ�������
	int Return_rank() {
		return rank;
	}
	
	
public
	//�û��ӿ�

	//���캯��
	Calabash_boy(){
		color = Color.Null;
		rank = NULL;
	}
	
	//������ɫ�����еĹ��캯��
	Calabash_boy(Color col, int r){
		color = col;
		rank = r;
	}
	
	//�趨һ����«�޵���ɫ�������趨����
	void Set_color(Color col) {
		color = col;
		rank = col.ordinal();
	}
	
	//�趨һ����«�޵���ɫ������
	void Set_color_rank(Color col, int r) {
		color = col;
		rank = r;
	}
	
	
	//�ú�«�ޱ����Լ�����
	String Report_rank_string() {
		String r = "��«��";
		switch(color.ordinal()) {
			case 1:		r = "����";break;
			case 2:		r = "����";break;
			case 3:		r = "����";break;
			case 4:		r = "����";break;
			case 5:		r = "����";break;
			case 6:		r = "����";break;
			case 7:		r = "����";break;
			default:	r = "û����������";break;
		}
		return r;
	}
	
	//�ú�«�ޱ����Լ���ɫ
	String Report_color_string() {
		String r = "��«��";
		switch(rank) {
			case 1:		r = "��";break;
			case 2:		r = "��";break;
			case 3:		r = "��";break;
			case 4:		r = "��";break;
			case 5:		r = "��";break;
			case 6:		r = "��";break;
			case 7:		r = "��";break;
			default: 	r = "û��������ɫ";break;
		}
		return r;
	}
	

}

