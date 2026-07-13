package basics;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      


      int[] arr = {1 , 2 , 3 , 4, 5, 6, 7,8 , 9 , 10 }; 
      BST bst = new BST(arr);   

      bst.display() ;
      bst.preorder();
      bst.inorder();
      bst.postorder();
    }
}


class BST{
    private class Node{
      private int data;
      private int height; 
      private Node left; 
      private Node right; 

      public Node(int data){
        this.data = data; 
      }

      public int getData(){
        return data; 
      }
    }


    public BST(){

    }


    public  boolean isSorted(int[] arr ){
    for(int i = 0 ; i  < arr.length -1 ; i++ ) {
        if (arr[i] > arr[i + 1]) {
            return false;
        }
    }
    return true;
}


    public BST(int[] arr){
        if(isSorted(arr)){
          insertSorted(arr); 
        } 
        else {
          insertUnsorted(arr); 
        }

    }

    private void insertSorted(int[] arr){

        insertSorted(arr , 0 , arr.length-1); 

      System.out.println("Inserted the sorted array :  " + Arrays.toString(arr) + "successfully");
    }
    private void insertSorted(int[] arr , int start , int end ){
      
      if(start > end ) {
        return; 
      }

      int mid = (start + end )/2; 

      insert(arr[mid]); 
      insertSorted(arr , start , mid-1);
      insertSorted(arr , mid+1 , end ); 

    }

    private void insertUnsorted(int[] arr ){
      for(int i = 0 ; i < arr.length ; i++){
          insert(arr[i]); 
      }

      System.out.println("Instered the Unsorted  array :  "+ Arrays.toString(arr) + "successfully");
    }


    private Node root;  

    public int height(Node node){
      if(node == null ){
        return -1; 

      }
      return node.height; 
    }


    public void display(){
        display(root , "Root Node : "); 
    }

    private void display(Node node , String details){
      if(node == null){
        return; 
      }
      System.out.println(details + node.data);
      display(node.left , "Left Child of "+ node.getData() + ": "); 
      display(node.right , "Right Child of "+ node.getData() + ": "); 
    }


    public void insert(int data){
      root = insert(root , data );
    }

    
    private Node insert(Node node , int data){

        if(node == null ){
          node = new Node(data); 
          return node ; 
        }

        if(data < node.data){
          node.left = insert(node.left , data); 
        }

        if(data > node.data){
          node.right = insert(node.right , data); 
        }
        node.height = Math.max(height(node.left) , height(node.right)) + 1 ; 
        return node;
    }

    public boolean balanced(Node node){
        if(node == null ){
          return true; 
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right); 
    }



    public void preorder(){
        System.out.print("[");
        preorder(root);
        System.out.println("]");
    }
    private void preorder(Node node){
        if(node == null ){
          return ; 
        }

        System.out.print(node.data + " ");
        preorder(node.left); 
        preorder(node.right); 
    }

    public void inorder(){
        System.out.print("[");
        inorder(root);
        System.out.println("]");
    }
    private void inorder(Node node){
        if(node == null ){
          return ; 
        }

        inorder(node.left); 
        System.out.print(node.data + " ");
        inorder(node.right); 
    }

    public void postorder(){
        System.out.print("[");
        postorder(root);
        System.out.println("]");
    }
    private void postorder(Node node){
        if(node == null ){
          return ; 
        }

        postorder(node.left); 
        postorder(node.right); 
        System.out.print(node.data+ " ");
    }


}