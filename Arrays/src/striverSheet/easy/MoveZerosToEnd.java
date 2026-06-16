package striverSheet.easy;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1 ,2 , 0 , 6 , 0  , 8 , 0 };

        int i =  0 , j =0 ;

        while(i < arr.length){
            if(arr[i] != 0){
                swap(arr , i , j );
                i++;
                j++;
            }

            else {
                i++;
            }
        }


        System.out.println(Arrays.toString(arr
        ));
    }


    public static  void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
