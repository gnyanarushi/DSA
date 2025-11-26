package basicPractice.CodeChef.ArrayProblems;

public class SecondLargest {


    public static void main(String[] args) {

        int[] arr = {10 , 10 , 10 };
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        // code here
        int max = 0;
        int secondmax = 0;
        boolean flag  = false;
       if(arr.length < 2 ) return -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[1] != arr[2]) flag = true;
            max = arr[i] > max ? arr[i] : max ;
            secondmax = (arr[i] > secondmax && arr[i] != max ) ? arr[i] : secondmax;
        }

        return flag ? -1 : secondmax;
    }
}
