package basicPractice.CodeChef.Algorithms;


import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
            int[] arr = {3 , 4 , 2  , 1  , 5 , 0 };
            cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static  void cycleSort(int[] arr ){
        int i  =0 ;
        while(i < arr.length){
            int correctIndex = arr[i] ;
            if(arr[i] != arr[correctIndex]){
                swapNumbers(arr , i , correctIndex);
            }
            else {
                i++;
            }
        }
    }

    private static void swapNumbers(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
