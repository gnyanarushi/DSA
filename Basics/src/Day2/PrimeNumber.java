package Day2.rishi;

import java.util.Scanner;

public class PrimeNumber {

    // prime number is a number which can divisible by one and itself only

    static void main() {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to check wheteher it is prime : ");
        int n = in.nextInt();


        System.out.print(isPrime(n) ? "The given nuumber is a prime number" : "The given number is composite number");
    }

    private static boolean isPrime(int n) {
        for(int i = 2 ; i <n ; i++ ){

            if(n%i == 0)  return false ;
        }

        return true;
    }
}
