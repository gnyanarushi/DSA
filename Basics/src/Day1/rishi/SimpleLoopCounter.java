package Day1.rishi;

import java.util.Scanner;

public class SimpleLoopCounter {

    static void main(){
                Scanner in = new Scanner(System.in) ;

        System.out.print("Enter the number to loop  : ");
        int n = in.nextInt();
        for(int i = 1 ; i <= n ;i++ ){

            System.out.println( i);
        }

    }
}
