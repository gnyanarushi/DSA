package Day2.rishi;

import java.util.Scanner;
public class SwapTwoNumbers {

    static void main() {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter first  number : ");
        Integer a = in.nextInt();
        System.out.print("Enter second number : ");
        Integer  b = in.nextInt();
        System.out.println( a  + " " + b );

            swap(a , b ) ;


        System.out.println( a  + " " + b );



    }

      static void swap(Integer a , Integer b ) {
        int temp = a;
        a = b ;
        b = temp;
    }
}
