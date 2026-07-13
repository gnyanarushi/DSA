package june.jun29;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "a";
        String t = "aa";

        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();

        String ans = minimumWindowSubstring.minWindow(s ,t );

        System.out.println(ans + "   " + ans.length());
    }
    public String  minWindow(String s, String t) {
        HashMap<Character , Integer> targetMap = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            targetMap.put(t.charAt(i) , targetMap.getOrDefault(t.charAt(i) , 0) + 1 );
        }

        String  minStr= null;
        int minSize = Integer.MAX_VALUE;

        for(int i = 0 ; i <= s.length() ; i++){
            for(int j = 0 ; j <= s.length() ; j++){
               if(i <=  j ){
                   String temp = s.substring(i , j);
                   if(isPresent(temp , targetMap)){
                       if(minSize > temp.length()){
                           minSize = temp.length();
                           minStr = temp;
                       }
                   }
               }
            }
        }
        return minStr == null ? "": minStr;
    }

    private boolean isPresent(String temp, HashMap<Character, Integer> targetMap) {


        HashMap<Character , Integer> sourceMap = new HashMap<>();
        for(int i = 0 ; i < temp.length() ; i++){
            sourceMap.put(temp.charAt(i) , sourceMap.getOrDefault(temp.charAt(i) , 0 )+1);
        }
        boolean isPresent = true;
        for(Character c : targetMap.keySet()){
            if(!(sourceMap.containsKey(c) && sourceMap.get(c) == targetMap.get(c)) ){
                isPresent = false;
            }
        }

        return isPresent;
    }
}
