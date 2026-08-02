package day1;

import java.util.Scanner;

public class FibonacciWithRecursion {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :  ");
         double n = sc.nextDouble();
        System.out.println();
        System.out.println( fibo(n ) );
        System.out.println("Counter : " + counter);
    }
    static  int counter;
    public  static  double fibo(double n ){
        counter++;
        if(n < 2)
            return n ;
        return fibo(n-1) + fibo(n -2 );
    }

}
