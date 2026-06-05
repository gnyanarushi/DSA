package sorting.ii;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : " );
        int[] arr = new int[sc.nextInt()];

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("Enter the " + i + "th element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        quickSort(arr , 0 , arr.length - 1 );

        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr , int low , int high ){


        if(low < high){
            int pivotIndex = partition(arr , low  ,high ) ;

            quickSort(arr , low , pivotIndex - 1) ;
            quickSort(arr , pivotIndex + 1 , high);
        }



    }


    public static int partition(int[] arr  , int low , int  high ){
        int i = low  , j = high , pivot  = arr[low];

        while (i < j ) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >=  low + 1) {
                j--;
            }
            if(i < j ) swap(arr,  i , j );
        }

        swap(arr , low , j );
        return j;
    }

    public static void swap(int[] arr , int a , int b ){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
