package basicPractice.CodeChef.LeetcodeProblems;

import java.util.Arrays;

public class SpellsAndPotions {

    public static void main(String[] args) {

        int[] spells = {3, 1, 2};
        int[] potions = {8, 5, 8};

        System.out.println(Arrays.toString(successfulPairs(spells, potions, 16)));
    }


    public static int[] successfulPairs(int[] spells, int[] potions, long success) {

        int[] arr = new int[max(potions) + 1];

        for (int i = 0; i < spells.length; i++) {
            arr[potions[i]]++;
        }



        for (int i = arr.length - 1; i > 0; i--) {

            arr[i - 1] += arr[i];

        }

        int[] ans = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            long div = success / spells[i];
            if (div * spells[i] < success) {
                div++;
            } else {
                ans[i] = arr[(int) div];
            }
        }


        return ans;
    }

    public static int max(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

}
