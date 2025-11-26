import java.util.Scanner;

public class LargestOfThree {



    static void main(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number  :  " );

        int a = in.nextInt();


        System.out.print("Enter the second  number  :  " );

        int b = in.nextInt();

        System.out.print("Enter the third number :  ");

        int c = in.nextInt();


        if( a > b &&  a > c ) {
            System.out.println( "The largest number is : " + a );
        }

        else if ( b > a && b > c ) {
            System.out.println( "The largest number is  : " + b );

        }

        else System.out.println( "The largest number is : " + c  );

    }
}
