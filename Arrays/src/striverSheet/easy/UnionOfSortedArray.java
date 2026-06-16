package striverSheet.easy;

import java.util.ArrayList;

public class UnionOfSortedArray {


    public static void main(String[] args) {

        // Set<Integer> set = new TreeSet<>();

        // for(int i = 0 ; i < arr1.length; i ++){
        //     set.add(arr1[i]);
        // }
        // for(int i = 0 ; i < arr2.length; i ++){
        //     set.add(arr2[i]);
        // }


//        1 2 3 4 5
//        1 2 3

        // this goes with the ( n1 log n ) + (n2 log n ).  now we will try to give
        // optimal approach for this problem.


        int[] arr1 = { 1  , 2, 3, 4,  5};
       int[]  arr2 = {1 , 2 , 3 };


        ArrayList<Integer> list = new ArrayList<>();
        int i = 0 ;
        int j = 0 ;

        while(i < arr1.length  && j < arr2.length){
            if(arr1[i] <= arr2[j] ){
                if(list.isEmpty() || list.getLast() != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }
            else {
                if(list.isEmpty() || list.getLast() != arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        while(j < arr2.length){

            if(list.isEmpty() || list.getLast() != arr2[j]){
                list.add(arr2[j]);
            }
            j++;

        }

         while(i < arr1.length){
                 if(list.isEmpty() || list.getLast() != arr1[i]){
                     list.add(arr1[i]);
                 }
                 i++;

         }


        System.out.println(hello());

    }


    public static int hello(){
        try {
            return 10;
        }

        catch (Exception e){
            return  20 ;
        }
        finally {
            return 30 ;
        }

    }
}
