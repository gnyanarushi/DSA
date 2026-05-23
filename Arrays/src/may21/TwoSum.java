package may21;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = { 2 , 1, 5, 3};
        int[] res = {0, 0 };
        int target = 7;
        for(int i = 0 ; i < arr.length ; i++ ){
            for(int j = 0 ; j < arr.length; j++ ){

                if((arr[i]+arr[j])== target && (i != j) ){
                    res[0] = i;
                    res[1] = j ;
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(res));


    }
}
