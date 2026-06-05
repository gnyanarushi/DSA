package striverSheet.easy;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {4 , 5 , 3, 2, 5,  5, 7 };
         long startTime = System.nanoTime();
        largestElement(arr);

        long endTime = System.nanoTime();

        System.out.println((endTime - startTime)/1_000_000 + " MilliSeconds");
    }


    public static void largestElement(int[] arr ){

//        Arrays.sort(arr);
//        System.out.print("[ " );
//        for(int i = 0 ; i < arr.length ; i++ ){
//            System.out.print(arr[i] +", ");
//        }
//
//        System.out.print("]");
//
//        System.out.println();
//        System.out.println(arr[arr.length - 1 ]);
        int max = Integer.MIN_VALUE ;


        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        System.out.println(max);

    }
}
