package Day2;

import java.util.Scanner;

public class FactorialIterative {


    public  static void main(String[] args ){
            Scanner in = new Scanner(System.in);
        System.out.print("Enter the number  :  ");
            int n =  in.nextInt();

            int fact = 1 ;
            for(int i = 1 ; i <= n ; i++ ){

                fact = fact * i ;
            }


        System.out.println("The factorial " + n + "  is  : " + fact);

    }
}
