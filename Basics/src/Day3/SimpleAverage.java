package Day3.rishi;

import javax.swing.*;
import java.util.Scanner;

public class SimpleAverage {

    static void main() {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = in.nextInt();
        System.out.print("Enter the second number : ");
        int b = in.nextInt();
        System.out.print("Enter the third number   :  ");
        int c = in.nextInt();

        int average = (a + b + c ) / 3;

        System.out.println("The average of the three numbers is : " + average );

    }

}
