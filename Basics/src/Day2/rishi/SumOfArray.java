package Day2.rishi;

public class SumOfArray {


    static void main() {
        int[] arr = {1 , 3, 4, 5, 6 , 7 } ;
        System.out.println(sum(arr));
    }

    private static int sum(int[] arr) {

        int sum = 0 ;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
