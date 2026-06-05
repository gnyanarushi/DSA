package striverSheet.easy;

import java.util.Arrays;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {

        int[] arr = { 3 , 4 , 5 , 1 ,2 };
//        for(int i = 0 ; i < arr.length ; i++){
//            if(isSorted(arr)){
//                System.out.println(Arrays.toString(arr));
//                System.out.println("array is sorted ");
//                break ;
//            }
//            System.out.println(Arrays.toString(arr));
//            reverseRotateArrayByOne(arr);
//        }

//        System.out.println(check(arr));



        // instead of checking the array multiple time whether it is sorted or not we will go with the
        // new concept called modular indexing which useful for circular indexing of arrays
        /*
        *   we will check the arrays  by using the
        *   arr[i] > arr[(i+1)%n] this gives let use take the example once
        *
        *   0  > (0+1) % 5  ==> 0 > 1
        *   1  > (1+1) % 5  ==> 0 > 2
        *   2  > (2+1) % 5  ==> 0 > 3
        *   3  > (3+1) % 5  ==> 0 > 4
        *   4  > (4+1) % 5  ==> 0 > 0
        * in the above example we can have a circular  array indexing on achieving the last index of the array
        *
        * */


        int breaks = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > arr[(i+1)% arr.length] ){
                breaks++;
            }

        }

        if(breaks == 0 || breaks == 1 ) System.out.println(true);
        else System.out.println(false );

    }


    public boolean check(int[] arr) {
        int breaks = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > arr[(i+1)% arr.length] ){
                breaks++;
            }

        }

          return
                  breaks == 1 || breaks == 0;
    }


//    public static boolean check(int[] arr) {
//        for(int i = 0 ; i < arr.length ; i++){
//            if(isSorted(arr)){
//                return true;
//            }
//        }
//        return false;
//    }

    public static boolean isSorted(int[] arr ){
        for(int i = 0 ; i  < arr.length - 1 ; i++ ) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static  void reverseRotateArrayByOne(int[] arr ){
        int temp = arr[arr.length -1 ];
        for(int i = arr.length -1 ; i > 0 ; i--){
            arr[i] = arr[i- 1];
        }
        arr[0] = temp;
    }


    public static void rotateArrayByOne(int[] arr ){
        int temp = arr[0];
        for(int i = 0 ; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length -1  ] = temp;
    }


}
