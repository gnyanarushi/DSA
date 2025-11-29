package DSA.SlidingWindow;

public class MaximumNumberOfVowelsInSubString {

    static void main() {
            String s = "abciiidef";
            int  k = 3 ;
            int max = 0 , vowelcount =0;
        for (int i = 0; i < k ; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'||
                    s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
            )
                vowelcount++;

        }
        max = vowelcount;


        System.out.println(max);
    }
}
