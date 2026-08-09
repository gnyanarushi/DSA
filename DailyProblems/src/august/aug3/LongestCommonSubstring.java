package august.aug3;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonSubstring {

    public  static  int longestCommonSubString(String s1 , String s2){
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];



        for(int i = 1 ; i < dp.length;i++){
            for(int j = 1 ; j < dp[i].length; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }
            }
        }

        for(int[] p : dp ){
            System.out.println(Arrays.toString(p));
        }

        int maxLength = Integer.MIN_VALUE;

        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0 ; j < dp[i].length ; j++){
                if(maxLength < dp[i][j]){
                    maxLength = dp[i][j];
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {


        String s1 = "hish";
        String s2 = "vista";

        int maxLength = longestCommonSubString(s1 , s2);
        System.out.println();
        System.out.println("Maximum Length : "+maxLength);
    }
}
