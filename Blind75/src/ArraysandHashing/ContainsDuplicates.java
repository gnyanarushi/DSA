package ArraysandHashing;

public class ContainsDuplicates {


    public static void main(String[] args) {

         int[] arr = {1 ,2 , 5, 6, 4, 3  };
        System.out.println(containsDuplicates(arr));
    }

    private static boolean containsDuplicates(int[] arr ){

        for(int i = 0 ; i < arr.length ; i++ ){
            int num = arr[i];
            for(int j = 0 ; j < arr.length ; j++ ){
                if( i != j) {
                    if(arr[j] == num ){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
