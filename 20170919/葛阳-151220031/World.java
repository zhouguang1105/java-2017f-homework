//package pack;

public class World {

	public static void main(String[] args)
	{
		
	Hulu[] bro=new Hulu[7];//��7����«��	
	Queue que = new Queue();//��һ������
	
	
	que.initQue(bro);//��ʼ������
	que.sortByNum();//�����ð������
	que.Number();//����
	que.initQue(bro);//��ʼ������
	que.sortByCol();//����ɫ��������
	que.Color();//����ɫ
	}
	
}
