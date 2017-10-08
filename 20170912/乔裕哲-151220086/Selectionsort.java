public class Selectionsort {
    public static void main(String []args){
        /* generate 10 integers */
        int []numbers = new int[]{32,43,53,54,32,65,63,98,43,23};

        /* selection sort */
        for(int i = 0; i < numbers.length; ++i){
            int min = i;
            for(int j = i + 1; j < numbers.length; ++j) {
                if (numbers[min] > numbers[j]) {
                    min = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }

        /* print the array */
        for(int i = 1; i < numbers.length; ++i)
            System.out.println(numbers[i]);

    }
}
