package LeetCodeProblems;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        int[] arr = { 1 , 4, 5, 6,7 };

        int[] ans = reverseArrayByNewArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    // brute to reverse an array
    // we creatnig a new array to reverse an array but consider if there is 10000 objects in the array.
    // what is the space complexity of the array we cannot imagine the space of creating the array of those objects
    private static int[] reverseArrayByNewArray(int[] arr ){
        int[] ans = new int[arr.length];
        int temp =0 ;
        for(int i = arr.length-1 ; i >= 0 ; i-- ){
            ans[temp++] = arr[i];

        }
        return ans;
    }


    // beter approach to reverse an array in with space complexity
    private static void reverseAnArrayWithoutNewArray(){

    }


}
