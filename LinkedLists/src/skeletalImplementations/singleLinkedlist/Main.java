package skeletalImplementations.singleLinkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        Scanner sc  = new Scanner(System.in);
        for(int i = 11 ; i <= 20 ; i++){
            singleLinkedList.insertElement(i);
        }

//        singleLinkedList.printList();

        singleLinkedList.insertAtEnd(21);

        for(int i = 10 ; i >= 1 ; i--){
            singleLinkedList.insertAtStart(i);
        }
        singleLinkedList.printList();
        System.out.println();
        System.out.println("Size of the List : " + singleLinkedList.size);



    }
}
