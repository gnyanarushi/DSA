package Day3;

import java.util.Scanner;

public class CountVowels {

    public  static void main(String[] args ){
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
