package arrays;

import java.util.Arrays;

public class MoveAllZerosToEnd {
    //    Move all zeros in the array to the end.
    public static void main(String[] args) {

        int[] arr = {11, 0 , 4, 6, 0 , 3, 0 , 2 ,1 };

        int counter = 0;
        for(int i = 0; i < arr.length ; i++ ){
            if(arr[i] != 0 ){
                arr[counter] = arr[i];
                counter++;
            }
        }

        while (counter < arr.length){
            arr[counter] = 0 ;
            counter++;
        }


        System.out.println(Arrays.toString(arr));
    }
}
