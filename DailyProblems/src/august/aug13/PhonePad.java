package august.aug13;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {


    static String[] numpad = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};

    public static void main(String[] args) {


        String query = "234";

        List<String> ans = new ArrayList<>();

//        String str1 = numpad[query.charAt(0) - '0'];
//        String str2 = numpad[query.charAt(1) - '0'];
//        String str3 = numpad[query.charAt(2) - '0'];
//
//
//        for(int i = 0 ; i < str1.length() ;i++){
//            for (int j = 0 ; j < str2.length() ; j++){
//               for (int k = 0 ; k < str3.length(); k++){
//                   char[] arr = {str1.charAt(i) , str2.charAt(j) , str3.charAt(k)};
//                   String temp = new String(arr);
//                   ans.add(temp);
//               }
//            }
//        }

        numpadGenerator(query , "" , ans);

        System.out.println(ans);
    }

    public static  void numpadGenerator(String query , String ans , List<String> combList) {

        if(query.isEmpty()){
            combList.add(ans);
            return;
        }

        String  key = numpad[query.charAt(0)-'0'] ;

        for(int i = 0 ; i < key.length() ; i++){
            numpadGenerator(query.substring(1), ans + key.charAt(i) , combList);
        }
    }
}
