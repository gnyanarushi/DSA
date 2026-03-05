package introductoryProblems;

import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  n  =  sc.nextInt();
        System.out.print(n + " ");


//        brute force approach to get the output
        while(n != 1 )  {
                if(isEven(n)){
                    n = n /2 ;
                }
                else{
                    n = (n*3) + 1 ;
                }
                System.out.print(n + " ");
            }



    }
     static boolean isEven(long n ) {
        return (n & 1) == 0;
    }
}
