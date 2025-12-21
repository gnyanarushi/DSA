package Day3.rishi;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class LinearSearch {

    static void main(String[ ] args) {


        Scanner in = new Scanner(System.in);
        int[] arr = {10 , 23 , 45 , 34 , 56 ,76 , 56 };


        System.out.print("Enter the target number : ");
        int target = in.nextInt();



        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == target) {
                System.out.println(
                        "The target found at " + (i + 1) + " index"
                );
                break;
            }
        }


    }
}
