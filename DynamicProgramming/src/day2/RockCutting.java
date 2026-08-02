package day2;

import java.util.Arrays;

public class RockCutting {

    public static int clothCutting(int[]  profits){
        int[] dp = new int[profits.length + 1 ];

        for(int i = 1 ; i <= profits.length ; i++){
            dp[i] = profits[i-1];
            for(int j = i-1 ; j > 0; j--){
                dp[i] = Math.max(dp[i] , dp[i-j] + profits[j-1]);
            }
        }


        System.out.println(Arrays.toString(dp));
        return dp[dp.length - 1];
    }
    public static void main(String[] args) {
        int[] profits = {1 , 5, 8 , 9 , 10 ,  17 , 17 , 20 , 24 , 30} ;
        clothCutting(profits);
        //  System.out.println(profits.length);
    }
}
