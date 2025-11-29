package Day1.yasasri;

import java.util.Scanner;

public class AddingTwoNumbers {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("fist number:");
        int a = in.nextInt();
        System.out.println("second number:");
        int b = in.nextInt();
        int c = a+b;
        System.out.println("result:"+c);
    }
}
