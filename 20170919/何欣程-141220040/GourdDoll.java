enum Color {
    RED,ORANGE,YELLOW,GREEN,CYAN,BULE,PURPLE
}

enum Order{
	ONE,TWO,THREE,FOUR,FIVE,SIX,SEVNE
}

/*=====���嵥����«�޵����Ժ���Ϊ======*/
public class GourdDoll {
	private String name;//����
	private Order order;//����
	private Color color;//��ɫ
	private int cur_pos;//��ǰλ��
	//private int nex_pos;//��һ��λ��
	public GourdDoll(String cname,Order corder,Color ccolor,int ccur){
		name=cname;
		order=corder;
		color=ccolor;
		cur_pos=ccur;
		//nex_pos=cnex;
	}
	
	/*======�����������=========*/
	public String order_to_chinese(Order order){
		int iorder=order.ordinal();
		String ret="";
		switch(iorder){
		case 0:
			ret="�ϴ�";
			break;
		case 1:
			ret="�϶�";
			break;
		case 2:
			ret="����";
			break;
		case 3:
			ret="����";
			break;
		case 4:
			ret="����";
			break;
		case 5:
			ret="����";
			break;
		case 6:
			ret="����";
			break;
		}
		return ret;
	}
	/*======�����������=========*/
	public String color_to_chinese(Color color){
		int icolor=color.ordinal();
		String ret="";
		switch(icolor){
		case 0:
			ret="��ɫ";
			break;
		case 1:
			ret="��ɫ";
			break;
		case 2:
			ret="��ɫ";
			break;
		case 3:
			ret="��ɫ";
			break;
		case 4:
			ret="��ɫ";
			break;
		case 5:
			ret="��ɫ";
			break;
		case 6:
			ret="��ɫ";
			break;
		}
		return ret;
	}
	
	public void change_pos(int newpos){//Ų��λ�ò�����
		System.out.println(order_to_chinese(order)+":"+cur_pos+"->"+newpos);
		cur_pos=newpos;
	}
	
	public void say_order(){//��������
		System.out.print(order_to_chinese(order)+"  ");
	}
	
	public void say_color(){//������ɫ
		System.out.print(color_to_chinese(color)+"  ");
	}	
	
	/*==���⴫�ݳ�Ա===*/
	public String get_name(){
		return name;
	}
	public Order get_order(){
		return order;
	}
	public Color get_color(){
		return color;
	}
	public int get_pos(){
		return cur_pos;
	}
}
