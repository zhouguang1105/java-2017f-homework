import java.util.Random;
/**
 *package BottleGourdBaby; 
 * @author wxz
 *2017.9.24
 */
public class BottleGourdBaby{
	public static void main(String[] args){
		//Create 7 boys
		BGB Fst =new BGB("red", "1stBGBaby",1);
		BGB Snd =new BGB("orange", "2ndBGBaby",2);
		BGB Thd =new BGB("yellow","3rdBGBaby",3);
		BGB Fth =new BGB("green","4thBGBaby",4);
		BGB Fvth =new BGB("cyan","5thBGBaby",5);
		BGB Sxth =new BGB("blue","6thBGBaby",6);
		BGB Seth =new BGB("purple","7thBGBaby",7);	
		
		SortBox box1 = new SortBox();		
		//3,7,5,1,6,4,2
		box1.add(Thd);box1.add(Seth);box1.add(Fvth);box1.add(Fst);
		box1.add(Sxth);box1.add(Fth);box1.add(Snd);
		
		System.out.println("before Sort:");
		box1.PrintByRank();
		System.out.println("-------------------------------------------");
		System.out.println("BubbleSort  details:");		
		box1.SortByBubble();
		System.out.println("-------------------------------------------");
		System.out.println("After Sort:");
		box1.PrintByRank();
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		SortBox box2 = new SortBox();		
		//3,7,5,1,6,4,2
		box2.add(Thd);box2.add(Seth);box2.add(Fvth);box2.add(Fst);
		box2.add(Sxth);box2.add(Fth);box2.add(Snd);
		
		System.out.println("before Sort:");
		box2.PrintByColor();
		System.out.println("-------------------------------------------");
		System.out.println("BinarySort details:");
		box2.SortByBinary();
		System.out.println("-------------------------------------------");
		System.out.println("After Sort:");
		box2.PrintByColor();
		

	}
	
	public static void Init_1(){
			
	}
}
class BGB{//��«����
	int _rank;
	String color;
	String rank;
	public BGB(String col,String ran,int no){//���캯��
		color = col;
		rank = ran;
		_rank = no;
	}
	public BGB(BGB a){//���캯��
		color = a.color;
		rank = a.rank;
		_rank = a._rank;
	}
	public void GetColor(){//������ɫ
		System.out.print(color);
	}
	
	public void GetRan(){//��������
		System.out.print(rank);
	}
}

class SortBox{		//һ�������
	int count=0;
	BGB[] Array = new BGB[7]; 
	public void add(BGB a){//��һ����«����ӽ������
		Array[count++] = new BGB(a);
	}
	
	public int GetCount(){return count;} //�õ�Ŀǰ��������ж��ٸ���«��
	
	public void SortByBubble(){//ð�ݷ�����
		for(int i=0;i<count-1;i++){
			for(int j=i+1;j<count;j++){
				if(Array[i]._rank>Array[j]._rank){
					BGB Temp =Array[i];
					Array[i] = Array[j];
					Array[j] = Temp;					
					System.out.println(Array[i].rank+": "+j+"->"+i+"; "+Array[j].rank+": "+i+"->"+j+";");
				}
			}
		}
	}
	public void SortByBinary(){//���ַ�����
		int[] indexs ={0,1,2,3,4,5,6};
		Random rand = new Random();
		int index = rand.nextInt(indexs.length);		
		int key = indexs[index]; //ȡ�������Ϊ���ֵ���ʼλ�á�
		
		int high,low;
		BGB temp ;
		for(int i=1;i<count;i++){
			temp = new BGB(Array[i]);
			low =0;
			high = i-1;
			while(low <= high){
				key = (low + high)/2;
				if(Array[key]._rank>temp._rank){
					high =key - 1;
				}else low =key+1;
			}
			
			for(int j=i-1;j>high;j--){
				Array[j+1] = Array[j];
			}
			Array[high +1] = temp;	
			System.out.println(Array[i].rank+": "+(high+1)+"->"+i+"; "+Array[high+1].rank+": "+i+"->"+(high+1)+";");
		}
		
	}
	public void PrintByColor(){//��ӡ��˳���º�«�޵���ɫ
		for(int i=0;i<count;i++){
			System.out.println(Array[i].rank+": My color is "+Array[i].color+";");
		}
	}
	public void PrintByRank(){//��ӡ��˳���º�«�޵�����
		for(int i=0;i<count;i++){
			System.out.println(Array[i].rank+": I am No."+Array[i]._rank+";");
		}
	}
}