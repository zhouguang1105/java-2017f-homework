/*
 select sort
*/
package mysort;
public class Sort {
        public static void main(String[] args) {
                int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};
                for(int i=0; i< numbers.length-1; i++)
                { 
                     int k=i;
                     for(int j=i;j<numbers.length;j++)
                     {
                    	 if(numbers[j]>numbers[k])
                    		 k=j;
                     }
                     if(k!=i)
                     {
                    	 int temp=numbers[i];
                    	 numbers[i]=numbers[k];
                    	 numbers[k]=temp;
                     }
                }
                for(int i=0; i< numbers.length; i++)
                         System.out.println(numbers[i]+" ");

        }
}