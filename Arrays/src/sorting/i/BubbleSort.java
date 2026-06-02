package sorting.i;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {98 , 65 , 54, 43, 32, 21,12};

        for(int i = 0 ; i < arr.length - 1 ;i++ ){
            boolean didSWap  = true;
            for(int j = 0 ; j < arr.length - i - 1  ; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr , j , j+1);
                    didSWap = false;
                }

                if (didSWap){
                    break;
                }
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
