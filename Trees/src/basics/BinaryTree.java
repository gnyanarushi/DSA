package basics;

import java.util.Scanner;

public class BinaryTree {

    private   class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    private Node root;


    public void populate(Scanner sc){
        System.out.print("Enter the value for root Node : " );
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc , root);
    }

    public void  populate(Scanner sc , Node node ) {
        System.out.print("Do You want to add the node of the left to " + node.data + ": ");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.print("Enter the value to the node left to " + node.data + " : ");
            int n = sc.nextInt();
            node.left = new Node(n);
            populate(sc , node.left);
        }
        System.out.print("Do You want to add the node of the right to " + node.data + ": ");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.print("Enter the value to the node right to " + node.data + " : ");
            int n = sc.nextInt();
            node.right = new Node(n);
            populate(sc , node.right);
        }
    }

    public void display(){
        display(root , 0);
    }


    public void display(Node node, int level){
        if(node == null){
            return;
        }
        display(node.right , level+1);

        if(level != 0 ){

            for(int i = 0 ; i < level-1 ; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|---------> " +node.data);
        }
        else System.out.println(node.data);

        display(node.left , level+1);
    }



}
