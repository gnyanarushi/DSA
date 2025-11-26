package DSA.PrefixSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class SeiveOfEranothesis {
    static void main() {
        System.out.println("Enter the no : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(prime[i]){
                for(int j = i*i ; j <= n ; j+=i){
                    prime[j] = false ;
                }
            }
        }


        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (prime[i]) primeNumbers.add(i);
        }
        System.out.println(Arrays.toString(prime));
        System.out.println(primeNumbers);
    }
}
