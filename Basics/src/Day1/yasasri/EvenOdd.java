package Day1.yasasri;

import java.util.Scanner;

public class EvenOdd {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a num: ");
        int a = in.nextInt();

        if (a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}
