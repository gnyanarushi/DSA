package Day2.rishi;

import java.util.Scanner;
public class SwapTwoNumbers {

    static void main() {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter first  number : ");
        int a = in.nextInt();
        System.out.print("Enter second number : ");
        int b = in.nextInt();


        swap(a , b );

        System.out.println( a  + " " + b );



    }

    static  void swap(int a , int b ) {
        int temp = a;
        a = b ;
        b = temp;
    }
}
