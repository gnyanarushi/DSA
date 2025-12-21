package Day1.rishi;

import java.util.Scanner;



// Operators in the java


public class AddingOfTwoNumbers{

    static void main(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = in.nextInt();
        System.out.print("Enter the second number : ");
        int b  = in.nextInt();
        System.out.println("The sum  of " + a + "and " + b + "  is : " + (a+b));
    }
}
