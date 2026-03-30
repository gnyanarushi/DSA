package basics;

import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {

        String s1 = "rishi";
        String s2 = "rishi";


//        how you are going to prove the two reference
//         variables are pointing to the same object

        /*
            Comparision of the two strings can be done in two ways


            1) if you want to check the value and the reference variable
            then you have  to use the "==" operator checks the values
            and the reference

                == this operator checks whether the two reference variables are pointing
                to the same object or not


              2) if you want to compare only the values of the two strings
                then you have to use the method called .equals() which is present
                in the String class

                ex: String s1 = "rishi";
                   String s2 = new String("rishi");

                   s1.equals(s2); ---> this returns the true or false whether the strings are equals or not



         */

        System.out.println(s1 == s2 );

        System.out. println(Arrays.toString(new int[]{4, 6}));

    }
}
