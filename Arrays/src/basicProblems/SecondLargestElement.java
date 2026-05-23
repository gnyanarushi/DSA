package basicProblems;

public class SecondLargestElement {

    //    Find the second-largest element in an array.
    public static void main(String[] args) {

        int[] arr = new int[10];

      if(arr.length > 2) {



          int max1 = arr[0];
          int max2 = arr[1];
          if(arr[1] > arr[0]){
              max1 = arr[1];
              max2 = arr[0];
          }


          for (int i = 2;  i < arr.length; i++) {
            if(arr[i] > max1){
                max2   = max1 ;
                max1    = arr[i];
            }
            else if (arr[i] > max2){
                max2  = arr[i];
            }
          }


          System.out.println("Maximum Element : " + max1);
          System.out.println("Second Maximum Element : "+ max2);
      }
    }
}
