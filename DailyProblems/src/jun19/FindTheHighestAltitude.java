package jun19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FindTheHighestAltitude {

    public static void main(String[] args) {

        FindTheHighestAltitude findTheHighestAltitude = new FindTheHighestAltitude();

//        int[] a = {-5,1,5,0,-7};
        int[] a = {-4,-3,-2,-1,4,3,2};

         int ans  = findTheHighestAltitude.largestAltitude(a);


        System.out.println(ans);
    }

    public int  largestAltitude(int[] gain) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);

        for(int a : gain){
            list.add((list.getLast() + a));
        }
        return max(list);

    }
    public int max(ArrayList<Integer > list){
        int max = Integer.MIN_VALUE;
        for(int i : list ){
            if(i > max) {
                max = i;
            }
        }

        return max;
    }

}
