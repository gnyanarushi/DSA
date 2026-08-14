package august.aug10;
import java.util.ArrayList;

public class Permutations {

    public static void main(String[] args) {
        permutations("" , "abc");
        System.out.println(permutationsList("" , "abc"));
    }

    public static  void permutations(String processed , String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return ;
        }

        char ch  = unProcessed.charAt(0);

        for(int i = 0 ; i <=  processed.length() ; i++){
            String first = processed.substring(0 , i );
            String last = processed.substring(i , processed.length());
            permutations(first + ch + last , unProcessed.substring(1));
        }
    }

    public static  ArrayList<String> permutationsList(String processed , String unProcessed){

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
            ans.addAll(permutationsList(first + ch + last , unProcessed.substring(1)));
        }

        return ans;
    }
}
