package start;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int temp = n ;
        int reverse = 0 ;
        while(temp > 0){
            int res = temp % 10 ;
            reverse = reverse * 10 + res;
            temp  = temp / 10;

        }

        if(reverse == n ) {
            System.out.println("The given number is an palindrome.");
        }
        else {
            System.out.println("The given number is not an palindrome.");
        }

    }
}
