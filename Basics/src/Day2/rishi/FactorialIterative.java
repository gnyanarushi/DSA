package Day2.rishi;

import java.util.Scanner;

public class FactorialIterative {


    static void main() {

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
