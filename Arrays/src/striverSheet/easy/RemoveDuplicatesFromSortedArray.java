package striverSheet.easy;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = { -3,-1,0,0,0,3,3 };


        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }


    public static int removeDuplicates(int[] arr ) {
//        if(arr.length == 0) return 0;
//        Set<Integer> set = new TreeSet<>();
//        for(int i : arr){
//            set.add(i);
//        }
//
//        int i = 0;
//        for(int s : set){
//            arr[i++] = s;
//        }
//        return set.size();


        //moving to the optimal approach of removing duplicates


        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[temp]) {
                arr[temp + 1] = arr[i];
                temp++;
            }
        }
        return temp + 1;
    }
}

