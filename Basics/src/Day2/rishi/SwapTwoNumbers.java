package Day2.rishi;

import java.util.Scanner;
public class SwapTwoNumbers {

    static void main() {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter first  number : ");
        int a = in.nextInt();
        System.out.print("Enter second number : ");
        int  b = in.nextInt();
        System.out.println( a  + " " + b );


            int temp = a ;
            a = b;
            b = temp ;

        System.out.println("Swapped with the temporary variable");
        System.out.println( a  + " " + b );

        a = a+b;
        b = a - b ; // b = 20 , a = -10 ==>  b = -10 + 20 ===> b = 10
        a = a - b ; // a = 10 , b = 20 ===>   a = 10 - 20 ;  a = -10 ;


        System.out.println("Swapped with the - operator ");
        System.out.println( a  + " " + b );







    }



    // this method is not going to swap the variables present inside the main method
    // and also in  java there is no concept of the pass by reference in java
    // the variables coming to these method are confined to this method only
    // not going to change the values of the other methods




      static void swap(Integer a , Integer b ) {
        int temp = a;
        a = b ;
        b = temp;
    }
}
