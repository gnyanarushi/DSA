package DSA.SlidingWindow;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class CountNoOfNiceSubArrays {
    static void main() {
        int[] arr  = {1,1,2,1,1};
        int k = 2 ;
        int count = 0 , ans = 0;
        Map<Integer , Integer > map = new Hashtable<>();
        for(int i =0 ; i < arr.length ;i++){
            if(arr[i]%2 != 0 ) count++;
            int y = k - count;
            

        }
    }
}
