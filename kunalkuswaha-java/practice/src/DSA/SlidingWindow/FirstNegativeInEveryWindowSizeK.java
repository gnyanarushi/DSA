package DSA.SlidingWindow;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;

public class FirstNegativeInEveryWindowSizeK {
    static void main() {

        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2 ;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < arr.length -k +1 ; i++) {
            for(int j = i ; j < i+k ; j++){
                if(arr[j] < 0) ans.add(arr[j]);
                break;
            }
            if(ans.get(i-1) == null) ans.add(0);
        }
        System.out.println(ans);
    }
}
