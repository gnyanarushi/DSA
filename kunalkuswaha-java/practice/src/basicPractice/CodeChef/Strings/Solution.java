package basicPractice.CodeChef.Strings;

class LongestSubsequence {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int  lengthOfLongestSubstring(String s) {
           int count = 0;
           String existed  = "" ;
           for(int i = 0 ; i < s.length() ; i++){
                if(isPresent(existed , s.charAt(i))  && s.charAt(i) != s.charAt(i+1)){
                    count++;
                    existed += existed+s.charAt(i);
                }
           }
            return count;

    }
    public static boolean isPresent(String existed , char check){
        for(int i = 0 ; i < existed.length() ; i++){
            if(existed.charAt(i) == check){
                return false;
            }
        }
        return true;
    }
}