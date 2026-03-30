package basics;

public class Palindrome {

    public static void main(String[] args) {

        String str = "madam ";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str){
        if(str == null || str.isEmpty()){
            return true;
        }

        for(int i =0 ; i < str.length()/2 ; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i );
            if(start != end){
                return false;
            }
         }
        return true;
    }
}
