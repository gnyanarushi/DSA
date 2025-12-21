package Day1;

import java.util.Scanner;

public class EvenOrOdd {

    // conditional statement in java


    public  static void main(String[] args ){

        Scanner in = new Scanner(System.in);
        System.out.print("Entet the number to find the even or odd : " );
        int number = in.nextInt();


        if(number % 2 == 0 )
            System.out.println("The given number is an even  number ");

        else
            System.out.println("The given number is an odd number ");


    }
}
