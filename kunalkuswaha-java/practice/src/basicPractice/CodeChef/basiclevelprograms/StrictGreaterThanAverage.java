package basicPractice.CodeChef.basiclevelprograms;

import java.util.Scanner;

public class StrictGreaterThanAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 5 ;
        int b = 8 ;
        float c = (float) 6;

        System.out.println(isGreater((a+b) , c ) ? "Yes" : "No");


    }

    private static boolean isGreater(float  sum, float c) {
        if(sum >= c){
            return true;
        }
        return false ;

    }
}
