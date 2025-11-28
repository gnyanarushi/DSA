package Day2.yasasri;

import java.util.Scanner;

public class PrimeNumber {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a num to check wheather the given num is prime or not :");
        int a = in.nextInt();

        System.out.println(isprime(a)?"it is prime":"it is not prime");
    }

    private static boolean isprime(int a) {
        for (int i=2;i<a;i++){
            if (a%i==0){
                return false;
            }

        }
        return true;
    }
}
