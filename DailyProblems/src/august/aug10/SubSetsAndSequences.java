package august.aug10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class SubSetsAndSequences {
    public static void main(String[] args) {
//        int[] arr = {1 , 2 ,3 };
//        System.out.println(numse(arr));

        System.out.println(subSequenceReturn("" , "abc"));
    }


    static ArrayList<String> subSequenceReturn(String processed , String unProcessed ){

        if(unProcessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list ;
        }

        char ch = unProcessed.charAt(0);

        ArrayList<String> left =   subSequenceReturn(processed + ch , unProcessed.substring(1));
        ArrayList<String> right =  subSequenceReturn(processed , unProcessed.substring(1));

        left.addAll(right);
        return left;
    }

    static void subSequence(String processed , String unProcessed ){

        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

       subSequence(processed + ch , unProcessed.substring(1));
        subSequence(processed , unProcessed.substring(1));

    }

    static List<List<Integer>> numseq(int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();

            for(int i = 0 ; i < n ; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
            System.out.println(outer);
        }
        return outer;
    }


}
