import java.util.Random;

/*=====����һȺ��«�޺�һȺ�ӵĻ���=====*/
public class GourdDollGroup {
	
	private GourdDoll[] brothers;//���鱣���«���ֵ�
	private Position[] position;//���鱣��1-7�ſ����
	private boolean[] is_empty;//������������¼��ռ�����
	
	public GourdDollGroup(){
		brothers=new GourdDoll[8];//��«�����1-7
		position=new Position[8];//λ�����1-7
		is_empty=new boolean[8];
		/*===��ʼ�Ӻţ���ȫ��û��====*/
		for(int i=1;i<8;i++){
			position[i]=new Position(i);
			is_empty[i]=true;
		}
	}

	/*====һ����«�޵�������«����������������«��,�����ź�«�����====*/
	public void AddDoll(String cname,Order corder,Color ccolor,int ccur,int id){
		brothers[id]=new GourdDoll(cname,corder,ccolor,ccur);
		position[ccur].addDoll(id);
		//is_empty[ccur]=false;
	}
	
	/*=====���к�«�޵�������������===*/
	public void DollsBorn(){
		for(int i=1;i<=7;i++)
			is_empty[i]=true;
		int []randnum=new int[8];
		Random random = new Random();
		/*=======��ÿ����«�޷ַ���������洢��randnum������===*/
		for(int i=1;i<=7;i++){
			int rand=random.nextInt(8);
			while(rand==0||is_empty[rand]==false)
				rand=random.nextInt(8);
			randnum[i]=rand;
			is_empty[rand]=false;
		}
		/*======��«�����=======*/
		AddDoll("����",Order.ONE,Color.RED,randnum[1],1);
		AddDoll("����",Order.TWO,Color.ORANGE,randnum[2],2);
		AddDoll("����",Order.THREE,Color.YELLOW,randnum[3],3);
		AddDoll("����",Order.FOUR,Color.GREEN,randnum[4],4);
		AddDoll("����",Order.FIVE,Color.CYAN,randnum[5],5);
		AddDoll("����",Order.SIX,Color.BULE,randnum[6],6);
		AddDoll("����",Order.SEVNE,Color.PURPLE,randnum[7],7);
	}
	
	/*========������ð������====*/
	public void BubbleSort(){
		int p1,p2,d1,d2;
		for(int i=7;i>1;i--)
			for(int j=1;j<i;j++){
				if(brothers[position[j].get_dollid()].get_order().ordinal()>brothers[position[j+1].get_dollid()].get_order().ordinal()){			
					d1=position[j].get_dollid();
					d2=position[j+1].get_dollid();
					p1=brothers[d1].get_pos();
					p2=brothers[d2].get_pos();
					//��«�޸��¿Ӻ�
					brothers[d1].change_pos(p2);
					brothers[d2].change_pos(p1);	
					//�Ӹ��º�«��
					position[p1].addDoll(d2);
					position[p2].addDoll(d1);
				}
					
			}
	}
	
	/*===============����ɫ��������========================*/
	public void quickSort(){
	    qsort(1, 7);
	}
	public void qsort(int low, int high){
	    if (low < high){
	        int pivot=partition(low, high);        //�������Ϊ������
	        qsort(low, pivot-1);                   //�ݹ�������������
	        qsort(pivot+1, high);                  //�ݹ�������������
	    }
	}
	public int partition(int low, int high){
	    int pivot = brothers[position[low].get_dollid()].get_color().ordinal();     //�����¼
	    int preid=position[low].get_dollid();
	    while (low<high){
	        while (low<high && brothers[position[high].get_dollid()].get_color().ordinal()>=pivot) --high;
            //����������С�ļ�¼�����
	        position[low].addDoll(position[high].get_dollid());
	        brothers[position[high].get_dollid()].change_pos(low);
	        while (low<high && brothers[position[low].get_dollid()].get_color().ordinal()<=pivot) ++low;
           //����������С�ļ�¼���Ҷ�
	        position[high].addDoll(position[low].get_dollid());
	        brothers[position[high].get_dollid()].change_pos(high);
	    }
	    //ɨ����ɣ����ᵽλ
	    position[low].addDoll(preid);
	    brothers[preid].change_pos(low);
	    //���ص��������λ��
	    return low;
	}

	
	/*======1-7�ſ���ĺ�«�����α���======*/
	public void SayOrder(){
		for(int i=1;i<=7;i++){
			brothers[position[i].get_dollid()].say_order();
		}
	}
	public void SayColor(){
		for(int i=1;i<=7;i++){
			brothers[position[i].get_dollid()].say_color();
		}
	}
}
	
	

