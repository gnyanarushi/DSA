package Day1;

import java.util.Scanner;

public class SimpleLoopCounter {

    public  static void main(String[] args ){
                Scanner in = new Scanner(System.in) ;

        System.out.print("Enter the number to loop  : ");
        int n = in.nextInt();
        for(int i = 1 ; i <= n ;i++ ){

            System.out.println( i);
        }

    }
}
