package may21.subarraySums;

public class SubArraySumEqualsK {
    public static void main(String[] args) {


        int[] arr = {1, 2 ,3 };
        int count = 0;
        int k = 3    ;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];


        }

        System.out.println(count);
    }
}



/*

 for(int i = 0 ;i < arr.length ; i++){
                int sum = 0;
            for (int j = i ; j < arr.length ; j++ ){
                    sum += arr[j];
                    if(sum == k ){
                      count++;
                    }
            }
        }
* */
