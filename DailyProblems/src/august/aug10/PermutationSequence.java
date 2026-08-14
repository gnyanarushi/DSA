package august.aug10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PermutationSequence {
    public static void main(String[] args) {
      PermutationSequence permutationSequence =   new PermutationSequence();
    String ans =   permutationSequence.getPermutation(4, 6);

        System.out.println(ans);
    }

    public String getPermutation(int n, int k) {
        StringBuilder sbuilder  = new StringBuilder();
        for(int i = 1 ; i <= n ; i++){
            sbuilder.append(i);
        }

      List<String> list = permutationsList ( "", sbuilder.toString() );

        Collections.sort(list);
        System.out.println(list);
        return list.get(k-1);
    }


    public static ArrayList<String> permutationsList(String processed , String unProcessed){

        ArrayList<String> ans = new ArrayList<>();
        if(unProcessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }


        char ch  = unProcessed.charAt(0);

        for(int i = 0 ; i <=  processed.length() ; i++){
            String first = processed.substring(0 , i );
            String last = processed.substring(i , processed.length());
            ans.addAll(permutationsList(last + ch + first , unProcessed.substring(1)));
        }

        return ans;
    }
}
