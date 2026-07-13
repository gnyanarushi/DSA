package skeletalImplementations.singleLinkedlist;

public class SingleLinkedList {

    Node head ;
    Node tail;
    int size = 0 ;


    private class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data ;
        }
        Node(int data , Node next){
            this.data =  data;
            this.next = next;
        }
    }

    public void insertAtEnd(int data){
        Node node = new Node(data);
        if(tail == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;
        size++;
    }



    public void insertAtStart(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node ;

        }
        node.next = head;
        head = node;
        size++;
    }

    public void insertElement(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }


    public void printList(){

        if(head == null ){
            System.out.println("The list is empty");
        }
        else {
            Node temp = head;
            while (true){
                System.out.print(" " + temp.data + " --> ");
                temp = temp.next;
                if(temp.next == null){
                    System.out.print(" " + temp.data );
                    break;
                }
            }
        }

        System.out.println();
    }





}
