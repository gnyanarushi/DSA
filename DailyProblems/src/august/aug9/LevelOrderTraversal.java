package august.aug9;

public class LevelOrderTraversal {

    Node root;

    // 3. Driver program with an expanded tree structure
    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();

        /* Constructing a larger binary tree:
                     1
                   /   \
                  2     3
                 / \   / \
                4   5 6   7
               / \
              8   9
        */
        tree.root = new Node(1);

        // Level 1
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        // Level 2
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        // Level 3
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);

        System.out.println("Tree structure successfully created with " + 9 + " elements.");
    }





}

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}



