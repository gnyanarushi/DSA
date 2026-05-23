package basicProblems;

public class SumofArrayElements {
    public static void main(String[] args) {


        //
//    Find the sum of all elements in an array.
//    Find the average of elements in an array.
//    Find the maximum element in an array.
//    Find the minimum element in an array.
//    Find the difference between the maximum and minimum elements.
        int[] arr = {10 , 20 , 30 , 40 , 50};

        int sum  = 0 ;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < arr.length ; i++ ){
            sum = sum + arr[i];
            if(arr[i] > max ) {
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + (sum / arr.length));
        System.out.println("Maximum : " + max);
        System.out.println("Minimum " + min ) ;
        System.out.println("Difference between max and min : "+ (max - min));
    }










//    Print all duplicate elements in the array.
//    Remove duplicate elements from the array.
//    Sort the array in ascending order (without using built-in methods).
//    Sort the array in descending order.
//    Merge two arrays into a single array.
//    Find the common elements between two arrays.


}