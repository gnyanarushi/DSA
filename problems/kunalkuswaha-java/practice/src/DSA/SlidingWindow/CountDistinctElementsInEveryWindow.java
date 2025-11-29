package DSA.SlidingWindow;

import java.util.*;

public class CountDistinctElementsInEveryWindow {

    static void main() {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        int left = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);


            if (i - left + 1 > k) {
                map.put(arr[left], map.get(arr[left]) - 1);


                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }

                left++;
            }

            if (i - left + 1 == k) {
                ans.add(map.size());
            }


        }
        System.out.println(ans);

    }
}

//
//int left = 0;
//int right = k - 1;
//ArrayList<Integer> ans = new ArrayList<>();
/// /            Set<Integer> set = new HashSet<>();
/// /            for (int i = left; i <= right; i++) {
/// /                    set.add(arr[i]);
/// /            }
//
//
//Map<Integer , Integer > map = new HashMap<>();
//                for(int i = 0 ; i < arr.length; i++){
//
//        if(map.containsKey(arr[i])){
//int count = map.get(arr[i]);
//                        map.put(arr[i] ,++count);
//                    }
//                            else {
//                            map.put(arr[i] , 1) ;
//                    }
//
//
//
//                            if((i-left) > k-1){
//int count = map.get(arr[left]);
//                       map.put(arr[left] , --count);
//                       if(map.get(arr[left]) == 0 ){
//        map.remove(arr[left]);
//                       }
//left++;
//        }
//
//        if((i - left) == k-1){
//        ans.add(map.size());
//        }
//        System.out.println(map);
//
//                }
//
//
//
//
//
//                        System.out.println(ans);