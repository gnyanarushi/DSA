package jul.jul2;

import java.util.Comparator;
import java.util.HashMap;

public class MaximumSumofDistinctArrays {

    public static void main(String[] args) {
//        int[] arr = {9,9,9,1,2,3};
//        int k = 3;
//        long ans = maximumSubarraySum(arr , k );
//        System.out.println(ans);


        for(int i = 0 ; i < 10 ; System.out.println(i++)  );
    }

    public static long  maximumSubarraySum(int[] nums, int k) {
        long sum = 0 ;
        long maxSum = 0 ;
        HashMap<Integer , Integer > distinct = new HashMap<>();


        for(int i =0 ; i < k ; i++){
            sum+=nums[i] ;
            distinct.put(nums[i] , distinct.getOrDefault(nums[i] , 0 ) + 1 );
        }

        if (distinct.values().stream().noneMatch(val -> val > 1)) {
            maxSum = sum;
        }

        for(int i = k ; i < nums.length ; i++){

            sum+= nums[i];
            distinct.put(nums[i] , distinct.getOrDefault(nums[i] , 0 ) + 1 );
            sum-=nums[i-k];
            distinct.put(nums[i-k] , distinct.getOrDefault(nums[i-k] , 0 ) - 1 );

            if(sum > maxSum && distinct.values().stream().noneMatch(val -> val > 1)){
                maxSum = sum;
            }
        }

        return maxSum;
    }



}
