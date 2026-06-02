package sorting.i;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {98, 87 , 65, 54,43,32,21,12};

        for(int i = 0 ; i < arr.length ; i++){
            int j = i ;
            while (j > 0 && arr[j -1 ] > arr[j]){
                swap(arr , j -1 , j );
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void swap(int[] arr , int a , int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
