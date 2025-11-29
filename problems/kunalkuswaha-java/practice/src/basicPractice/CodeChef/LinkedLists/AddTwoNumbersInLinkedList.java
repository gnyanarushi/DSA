package basicPractice.CodeChef.LinkedLists;

import org.w3c.dom.Node;

public class AddTwoNumbersInLinkedList {

    public static void main(String[] args) {

    }
    public static  void insert(ListNode head , int val ){
        ListNode newNode = new ListNode(val);
        ListNode tail  = head;
        if(head == null){
            head = newNode;
            tail = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode tail = null;
        int carry = 0  ;
        while(l1 != null || l2 != null){
            int sum = carry ;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;

            }

            if(sum > 9 ){
                carry = sum /10;
                sum = sum % 10;
            }
            ListNode result = new ListNode(sum);
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


//
//class ListNode {
//    int val ;
//    ListNode next ;
//    ListNode(){}
//    ListNode(int data){
//        this.val = data;
//        this.next = null;
//    }
//}
//




















//class LinkedList{
//    Node head;
//    public void insert(int data) {
//        Node newNode = new Node(data);
//        if(head == null){
//            head = newNode;
//            return ;
//
//        }
//        Node temp = head;
//        while(temp.next != null ){
//            temp = temp.next;
//        }
//
//    }
//}
