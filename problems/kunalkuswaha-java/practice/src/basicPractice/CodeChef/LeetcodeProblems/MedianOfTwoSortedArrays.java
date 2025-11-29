package basicPractice.CodeChef.LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MedianOfTwoSortedArrays {


    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {4 };
//        ArrayList<Integer> mergedArray = new ArrayList<>();
//        for(int n : nums1) mergedArray.add(n);
//        for(int n : nums2) mergedArray.add(n);
//        Collections.sort(mergedArray);
//        if(mergedArray.size()%2 == 0) {
//            double first = mergedArray.get((mergedArray.size()/2) - 1);
//            double second = mergedArray.get((mergedArray.size()/2));
//
//            System.out.println((first + second)/2);
//        }
//        else {
//            System.out.println((double) mergedArray.get(mergedArray.size() /2 ));
//        }

        System.out.println(Arrays.toString(mergeArrays(nums1,nums2 )));

            int[] mergedArray = mergeArrays(nums1,nums2 );
        Arrays.sort(mergedArray);
        if(mergedArray.length%2 == 0) {
            double first = mergedArray[((mergedArray.length /2) - 1)];
            double second = mergedArray[((mergedArray.length/2))];

            System.out.println((first + second)/2);
        }
        else {
            System.out.println((double) mergedArray[(mergedArray.length /2 )]);
        }



    }


    public  static int[] mergeArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] mergedArray = new int[arr1.length + arr2.length];
        while (i < arr1.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
                k++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }

        }

        for (int l = j; l < arr2.length ; l++) {
                mergedArray[k] = arr2[j];
                j++;
                k++;
        }

        return mergedArray;
    }
}
