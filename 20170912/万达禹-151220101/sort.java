package Sort;
import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n,i,j;
		System.out.println("���������鳤�ȣ�");
		n=in.nextInt();
		int a[] = new int[n];
		System.out.println("������"+n+"������");
		for(i=0;i<n;i++)
			a[i]=in.nextInt();
		for(i=0;i<n-1;i++)
			for(j=0;j<n-i-1;j++)
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
		System.out.println("����������Ϊ��");
		for(int num:a)
			System.out.print(num + " ");
	}

}
