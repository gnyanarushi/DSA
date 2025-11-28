package Day2.yasasri;

import java.util.Scanner;
public class SwappingOfTwoNumbers {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("enter 1st num: ");
        int a = in.nextInt();

        System.out.println("enter 2nd num: ");
        int b = in.nextInt();

        System.out.println(" the before swapping values a= "+a+"b="+b);
        swap(a,b);

    }

    private static void swap(int a, int b) {
        int temp = a;
        a=b;
        b=temp;
        System.out.println(" the After swapping values a= "+a+"b="+b);

    }
}
