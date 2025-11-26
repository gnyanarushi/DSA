package DSA.PrefixSum;

import java.util.Arrays;

public class CountPrimes {
    static void main() {

        int l  = 23;
        int r = 89 ;
        int[] prime = new int[r + 1];
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2; i <= Math.sqrt(r); i++) {
            if(prime[i] == 1){
                for(int j = i*i ; j <= r ; j+=i){
                    prime[j] = 0;
                }
            }
        }
//         This is the code in 0(n)
        int count = 0 ;
        for(int i = l ; i <= r;i++){
            if(prime[i] == 1) count++;
        }
        System.out.println(count);


        // this is the count in 0(log n )
//        to find the count of primes by logn complexity we have to use the prefix sum

        int[] prefix = new int[r+1];
        for(int i = 1 ; i <=r; i++){
            prefix[i+1] = prefix[i-1] + prime[i];
        }

        System.out.println(prefix[r] - prefix[l-1]);



    }


}
