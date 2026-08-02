package day1;


import java.util.Arrays;

// Program for finding the nth fibonacci number using the memoization
public class FibonacciSeriesWithMemoization {
    static  int counter;
    public static  int  fibo(int n , int[] dp ) {
        counter++;
        if(n  ==   0 || n == 1 ) {
            return n;
        }
        if(dp[n] != -1 ){
            return dp[n];
        }
        dp[n] = fibo(n-1 , dp ) + fibo(n -2 , dp ) ;
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        for(int i = 0 ; i <= n ; dp[i++] = -1);
        System.out.println(fibo(n , dp));
        System.out.println(counter);
        System.out.println(Arrays.toString(dp));
    }
}
