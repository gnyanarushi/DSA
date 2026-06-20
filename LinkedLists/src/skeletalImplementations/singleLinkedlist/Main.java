package skeletalImplementations.singleLinkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        Scanner sc  = new Scanner(System.in);
        for(int i = 1 ; i <= 10 ; i++){
            System.out.print("Enter the " + i + "th element : ");
            singleLinkedList.insertElement(sc.nextInt());
        }
        singleLinkedList.printList();
    }
}
