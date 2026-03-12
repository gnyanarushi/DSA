package start;

public class SumOfTheArray {
    public static void main(String[] args) {

        int[] arr = { 1 , 3, 5 , 6, 7, 7, 8 };

        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the array is : " + sum);
    }
}
