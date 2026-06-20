package jun19;

public class DeleteNodeInLinkedList {




    public static void main(String[] args) {
        Node head ;
        Node n1 = new Node(4);
        Node n2 = new Node(5);
        Node n3 = new Node(1);
        Node n4 = new Node(9);
        head = n1 ;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        printList(head);

        deleteNode(n3);


        printList(head);


    }


    public static void deleteNode(Node node){

        node.data = node.next.data;
        node.next = node.next.next;

    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){

            System.out.print(temp.data + " ");
            temp = temp.next;

        }


        System.out.println();
    }

}


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
