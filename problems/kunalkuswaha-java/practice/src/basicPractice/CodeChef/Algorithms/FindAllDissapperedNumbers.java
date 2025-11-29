package basicPractice.CodeChef.Algorithms;


import java.util.*;


public class FindAllDissapperedNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> missingNumbers = findAllMissingNumber(arr);
        System.out.println(missingNumbers);

    }

    public static List<Integer> findAllMissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swapTwo(arr, i, correct);

            } else i++;

        }

        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                result.add(j + 1);
            }
        }
        return result;

    }


    static void swapTwo(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }


}
