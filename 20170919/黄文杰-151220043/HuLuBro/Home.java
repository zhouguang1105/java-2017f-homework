package HuLuBro;
import java.util.*;
public class Home {
	Chair []chair;
	
	final int HULUCOUNT=7;
	public Home(HuLuWa []huluwa){
		chair=new Chair[HULUCOUNT+1];
		
		for(int i=0;i<HULUCOUNT+1;i++){
			chair[i]=new Chair();
		}
		chair[0].holder=huluwa[4];
		chair[1].holder=huluwa[2];
		chair[2].holder=huluwa[0];
		chair[3].holder=huluwa[6];
		chair[4].holder=huluwa[1];
		chair[5].holder=huluwa[3];
		chair[6].holder=huluwa[5];
		
	}
	void messUp(){
		Random random = new Random();
		
		for(int i=0;i<HULUCOUNT;i++){
			int j=Math.abs(random.nextInt())%7;
			changeChair(i, HULUCOUNT,false);
			changeChair(j,i,false);
			changeChair(HULUCOUNT,j,false);
		}
	}
	void changeChair(int from,int to,boolean show){//��fromλ���ϵĺ�«�޷ŵ�toλ����
		if(show)
			chair[from].holder.shout(from, to);
		chair[to]=chair[from];
		chair[from]=null;
	}
	public void outName(){//��˳������
		for(int i=0;i<HULUCOUNT;i++){
			System.out.print(chair[i].holder.getName()+' ');
		}
		System.out.println("");
	}
	public void outColor(){//��˳����ɫ
		for(int i=0;i<HULUCOUNT;i++){
			String colorName=new String("");
			switch(chair[i].holder.getColor()){
			case RED:colorName="��ɫ";break;
			case ORANGE:colorName="��ɫ";break;
			case YELLOW:colorName="��ɫ";break;
			case GREEN:colorName="��ɫ";break;
			case CHING:colorName="��ɫ";break;
			case BLUE:colorName="��ɫ";break;
			case PURPLE:colorName="��ɫ";break;
			}
			System.out.print(colorName+' ');
		}
		System.out.println("");
	}
	public void bubbleSort(){//ð������
		int count=HULUCOUNT;
		for(int i=0;i<count;i++){
			for(int j=0;j<count-i-1;j++){
				if(chair[j].holder.getRank()>chair[j+1].holder.getRank()){//�õ��߸�λ����Ϊ��ʱ��ת���н���
					changeChair(j,HULUCOUNT,true);
					changeChair(j+1,j,true);
					changeChair(HULUCOUNT,j+1,true);
				}
			}
		}
	}
	public void divideSort(){//��������
		int count=HULUCOUNT;
		for(int i=0;i<count;i++){
			
			int begin=0;
			int end=i-1;
			int mid=(begin+end)/2;
			while(begin<=end){
				mid=(begin+end)/2;
				if(chair[i].holder.getColor().compareTo(chair[mid].holder.getColor())>0){
					begin=mid+1;
					
				}
				else{		
						end=mid-1;
					
				}
			}
			for(int j=i;j>end+1;j--){
				
				changeChair(j,HULUCOUNT,true);
				changeChair(j-1,j,true);
				changeChair(HULUCOUNT,j-1,true);
			}
				
		}
	}
}

class Chair{
	HuLuWa holder;//���������ĺ�«��
}