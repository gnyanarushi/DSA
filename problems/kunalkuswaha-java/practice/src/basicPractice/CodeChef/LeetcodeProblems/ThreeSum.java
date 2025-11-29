package basicPractice.CodeChef.LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(-1);
        arr.add(4);




    }

    public static boolean isAllSame(ArrayList<Integer> arr, int i, int j, int k) {
        return arr.get(i) == arr.get(j) ||
                arr.get(i) == arr.get(k) ||
                arr.get(j) == arr.get(k);
    }

    public static  boolean isSumZero(ArrayList<Integer> arr , int i , int j , int k ){
        return (arr.get(i) + arr.get(j) + arr.get(k)) == 0;
    }


}
