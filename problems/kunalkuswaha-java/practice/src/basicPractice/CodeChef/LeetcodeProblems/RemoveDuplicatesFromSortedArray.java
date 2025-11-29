package basicPractice.CodeChef.LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int size = removedSize(arr);
        System.out.println(size);
        System.out.println(Arrays.toString(arr));
    }

    private static int removedSize(int[] arr) {

        ArrayList<Integer> nonduplicateArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!isElementPresent(arr[i] , nonduplicateArray)){
                nonduplicateArray.add(arr[i]);

            }
        }
        for (int i = 0; i < nonduplicateArray.size(); i++) {
            arr[i] = nonduplicateArray.get(i);
        }

        return nonduplicateArray.size();
    }

    private static boolean isElementPresent(int i, ArrayList<Integer> nonduplicateArray) {
        for (int j = 0; j < nonduplicateArray.size(); j++) {
            if(i == nonduplicateArray.get(j)) return    true;
        }
        return false;
    }


}
