package basicPractice.CodeChef.LinkedLists;

public class LinkedListImplementation {
    Node head ;
    Node tail;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = head;

        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public  static  void main(String args[]){
        LinkedListImplementation l1 = new LinkedListImplementation();
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);

        LinkedListImplementation l2 = new LinkedListImplementation();
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);

//        Node l1head = l2.head;
//        while(l1head != null){
//            System.out.println(l1head.data);
//            l1head = l1head.next;
//        }

        Node result = addTwoNumbers(l1.head , l2.head);
        while(result != null){
            System.out.println(result.data);
            result = result.next;
        }
    }

    public static Node addTwoNumbers(Node l1, Node l2) {

        Node head = null;
        Node tail = null;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int sum = carry ;
            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;

            }

            if(sum > 9 ){
                carry = sum /10;
                sum = sum % 10;
            }
            else {
                carry = 0 ;
            }

            Node result = new Node(sum);
            if(head == null){
                head = result;
                tail = head;
            }
            else {
                tail.next = result;
                tail = result;
            }


        }
        return head;
    }




}

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
