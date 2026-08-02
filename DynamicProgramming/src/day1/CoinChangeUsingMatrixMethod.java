package day1;

public class CoinChangeUsingMatrixMethod {



    public static  int coinChagne(int n , int[] coins){
        int[][] dp = new int[coins.length + 1 ][n+1];

//        for(int i = 0 ; i < dp.length;dp[0][i++] = 0);
//        for(int i = 0 ; i < dp[0].length ; dp[0][i++] = 0 );

        for(int i = 0 ; i <dp.length ; i++){
            for(int j = 1; j < dp[i].length ;j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }


       for(int i = 1 ; i < dp.length ; i++){
           int  coin = coins[i-1];
           for(int j = coin; j <= n ; j++){
               if(dp[i][j-coin] != Integer.MAX_VALUE){
                   dp[i][j] = Math.min(dp[i-1][j], 1+dp[i][j-coin] );

               }
               else {
                   dp[i][j] = dp[i-1][j];
               }
           }
       }


        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0; j < dp[i].length ;j++) {
                System.out.print(dp[i][j]+ " ");
            }
            System.out.println();
        }


        return -1;
    }


    public static void main(String[] args) {

        int n = 8 ;
        int[]  coins = {1 , 4 , 6};

         coinChagne(n , coins);

    }
}
