package august.aug13;

public class PalindromeUsingRecursion {
    public static void main(String[] args) {
        String str = "rishi";
        System.out.println(isPalindrome(str , 0 , str.length() - 1));
    }

    public static  boolean isPalindrome(String str , int i , int j ){

        if(str.charAt(i) != str.charAt(j)){
            return false;

        }
        if( i <= j ) {
            return true;
        }

        return isPalindrome(str , i + 1 , j - 1);

    }
}
