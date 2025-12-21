package Day3.rishi;

import java.util.Scanner;

public class CountVowels {

    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name : " );
        String name = in.next();
        int count =0 ;
        for(int i = 0 ; i  < name.length() ; i++ ){
                if(isVowel(name.charAt(i)))
                    count++;

        }

        System.out.printf("The vowel count in the given string are : " + count);
    }

    public static boolean isVowel(char c )  {
        if(c == 'a' ||
            c == 'e' ||
            c == 'i' ||
            c == 'o' ||
            c == 'u'
        ) return  true;


        return  false ;
    }
}
