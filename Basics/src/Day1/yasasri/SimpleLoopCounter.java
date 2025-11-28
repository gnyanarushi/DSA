package Day1.yasasri;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleLoopCounter {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter value of n: ");
        int a = in.nextInt();

        for(int i = 0;i<a;i++){
            System.out.println("interations :"+i);
        }
    }
}
