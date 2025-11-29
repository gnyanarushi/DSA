package Day2.yasasri;

import java.util.Scanner;

public class FactorialNumber {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a num: ");
        int a=in.nextInt();

        int fact=1;
        for (int i = 1; i<=a; i++){
            fact =+ fact * i;
        }
        System.out.println("factorial number of"+a+":"+fact);
    }
}
