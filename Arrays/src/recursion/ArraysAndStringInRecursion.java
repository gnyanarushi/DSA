package recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysAndStringInRecursion {

    public static void reverse(int[] arr , int i , int n){
        if(i >= n/2){
            return;
        }
        swap(arr , i , n - i - 1);
        reverse(arr , i+1 , n);
    }

    public static void swap(int[] arr , int a , int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1 ,4 , 6, 5 , 2, 3 };

        String s = "madam";

        System.out.println("Original Array : "+ Arrays.toString(arr));
        reverse(arr , 0 , arr.length);
        System.out.println("Reversed Array : "+Arrays.toString(arr));

//        System.out.println(isPalindrome(s , 0 ) ?  "Palindrome " : "Not Palindrome ");

    }





}
