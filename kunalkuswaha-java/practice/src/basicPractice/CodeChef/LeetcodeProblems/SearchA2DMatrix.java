package basicPractice.CodeChef.LeetcodeProblems;

import java.util.Arrays;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] arr =
                {


                {1,3,5,7},


                {10,11,16,20},


                {23,30,34,60}

        };
        int target = 3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public  static int colBinarySearch(int[][] arr , int target){
        int col = 0 ;
        int low = 0 ;
        int high = arr.length -1 ;
        while(low <= high){
            int mid = low + (high - low ) /2;

        }
        return col ;
    }
}
