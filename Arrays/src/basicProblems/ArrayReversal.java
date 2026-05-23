package basicProblems;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {

        int[] arr = {2 , 3, 4, 5, 6, 7, 8, 9 };

        // printing the array in reverse
        for(int i = arr.length -1 ; i >= 0 ; i-- ){
            System.out.print(arr[i] + " ");
        }

        System.out.println(
        );


        int start = 0 ;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;

        }

        System.out.println(Arrays.toString(arr));


    }
}
