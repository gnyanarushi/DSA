package sorting.i;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {12 , 34 ,  13 , 14  , 45 , 23 , 56};

        for(int i = 0 ; i < arr.length - 2 ; i++ ){
            int min = i ;
            for(int j = i ; j < arr.length ; j++){
                    if(arr[j] < arr[min]) {
                        min = j ;
                    }
            }

            swap(arr , i , min);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr , int a , int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
