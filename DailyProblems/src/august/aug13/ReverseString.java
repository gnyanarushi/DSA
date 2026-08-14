package august.aug13;

public class ReverseString {

    public static void main(String[] args) {

        String  string =  "rishi";

        System.out.println(reverse(string, ""  , string.length() -1 ));

    }


    public static  String reverse(String str , String ans  , int i  ){
        if( i < 0){
            return ans;
        }

        return reverse(str , ans + str.charAt(i) , i - 1) ;
    }
}
