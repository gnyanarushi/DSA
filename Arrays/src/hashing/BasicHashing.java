package hashing;

import java.util.Arrays;

public class BasicHashing {
    public static void main(String[] args) {
        directHashingOfNumbers();

        hashingOfAlphabetsInString();


        hashingOfAllCharacters();
    }

    public static void hashingOfAllCharacters(){

        String s = "!\"#$%&'()*+,-./\n" +
                "0123456789\n" +
                ":;<=>?@\n" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ\n" +
                "[\\]^_`\n" +
                "abcdefghijklmnopqrstuvwxyz\n" +
                "{|}~";

        int[] hashCount = new int[257];

        for(int i = 0; i < s.length(); i++){
            hashCount[s.charAt(i)]++;
        }

        System.out.println(Arrays.toString(hashCount));

    }

    private static void hashingOfAlphabetsInString() {
        String s = "rishi";
        int[] hashCount = new int[26];

        for(int i = 0 ; i < s.length(); i++){
            hashCount[s.charAt(i)- 'a']++;
        }

        System.out.println(Arrays.toString(hashCount));

    }


    public static void directHashingOfNumbers() {
        int[] arr = {1, 2, 3, 3, 2, 1, 4};

        int[] hashArray = new int[13];

        // precomputation for hashing the  array
        for (int i = 0; i < arr.length; i++) {
            hashArray[arr[i]]++;
        }

        System.out.println(Arrays.toString(hashArray));
    }
}
