package august.aug12Serialization;

import java.util.ArrayList;
import java.util.List;

public class Leetcode46Permutations {

    public static void main(String[] args) {
        Leetcode46Permutations leetcode46Permutations = new Leetcode46Permutations();

        int[] arr = {1 , 2 ,3 };
        System.out.println( leetcode46Permutations.permute(arr));
    }

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(nums , current , ans , used);
        return ans;
    }

    public  void recurPermute(int[] arr , List<Integer> cur , List<List<Integer>> ans , boolean[] used){

        if(cur.size() == arr.length){
            ans.add(new ArrayList<>(cur));
            return;
        }

        for(int i = 0 ; i < used.length; i++){
            if(!used[i]){
                used[i] = true;
                cur.add(arr[i]);
                recurPermute(arr , cur , ans , used);
                cur.removeLast();
                used[i] = false;
            }
        }
    }
}
