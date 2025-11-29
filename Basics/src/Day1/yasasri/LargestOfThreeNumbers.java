package Day1.yasasri;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("1st num:");
        int a = in.nextInt();

        System.out.println("2st num:");
        int b = in.nextInt();

        System.out.println("3st num:");
        int c = in.nextInt();

        if (a>b && a>c){
            System.out.println("a is largest");
        }
        else if(b>a && b>c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
    }
}
