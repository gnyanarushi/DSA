package basicPractice.CodeChef;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();
        for(int testcase = 0 ; testcase < testcases ; testcase++){

            int n = sc.nextInt();
            int k = sc.nextInt();

            ArrayList<Integer> c = new ArrayList<>();

            for(int i = 0 ; i < n ; i++) c.add(sc.nextInt());
            int sum = 0 ;
            for(int i = 0 ; i < k ; i++ ){
                int max = max(c);
                sum += max ;
                c.remove(max);
            }
            System.out.println(sum);

        }

    }

    private static int max(ArrayList<Integer> c) {
        int max  = 0 ;
         for(int i = 0 ; i < c.size() ; i++) {
             if(c.get(i) > max) max = c.get(i);
         }

         return max ;
    }


}





