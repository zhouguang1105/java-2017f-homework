
/*======����һ���ӵ����Ժ���Ϊ========*/
public class Position {
	
	private int id;//�ڼ��ſ�
	private boolean is_empty;//������û����
	private int dollid;//���ڿ���ĺ�«��
	
	public Position(){
		id=-1;
		dollid=-1;
		is_empty=true;
	}
	
	public Position(int i){
		id=i;
		dollid=-1;
		is_empty=true;
	}
	
	//��«�޽���
	public void addDoll(int newdoll){
		dollid=newdoll;
		is_empty=false;
	}
	
	//���Ƿ�Ϊ��
	public boolean is_pos_empty(){
		return (is_empty==true);
	}
	
	public int get_dollid(){
		return dollid;
	}
}
