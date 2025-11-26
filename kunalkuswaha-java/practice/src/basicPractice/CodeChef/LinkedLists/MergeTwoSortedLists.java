package basicPractice.CodeChef.LinkedLists;
public class MergeTwoSortedLists {
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

    public static void main(String[] args) {

    }




}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val)
    {
        this.val = val;
        this.next = null;
    }
}