package basicProblems;

public class EvenOrOddElementsInArray {

    public static void main(String[] args) {


        //    Find the sum of all even elements in the array.
        //    Find the sum of all odd elements in the array.
        //    Count the number of even and odd elements in an array.
        int[] arr = {9 , 4, 3 , 5, 6, 7  , 8 , 10 , 11, 14};

        int evenCount = 0 ,evenSum = 0 ;
        int oddCount = 0 , oddSum = 0 ;
        for(int i = 0 ; i < arr.length ; i++ ){
            if((arr[i] & 1) == 0 ){
                evenCount++;
                evenSum+=arr[i];
            }
            else {
                oddCount++;
                oddSum+=arr[i];
            }
        }
        System.out.println("Even Count : "+ evenCount);
        System.out.println("Even Sum : " + evenSum);
        System.out.println("Odd Count : " + oddCount);
        System.out.println("Odd Sum  : "+ oddSum );

    }
}