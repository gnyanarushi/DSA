package august.aug4;
import java.util.*;


public class VerticalTraversal {

    HashMap<TreeNode, ArrayList<Integer>> coordinates = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();


    public List<List<Integer>> verticalTraversal(TreeNode root) {

        inorder(root);
        System.out.println(list);

        return null;
    }


    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }

    public static TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            // Handle left child insertion
            if (arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;

            // Handle right child insertion
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    // Main method to test your logic locally
    public static void main(String[] args) {
        // LeetCode test array input format
        Integer[] nodes = {1, 2, 3,4,5,6,7};

        // 1. Builds the tree structure and returns the root node
        TreeNode root = buildTree(nodes);

        // 2. Instantiate solution
        VerticalTraversal solver = new VerticalTraversal();

        // 3. Run your custom implementation
        List<List<Integer>> output = solver.verticalTraversal(root);

//        System.out.println("Your Traversal Output: " + output);
    }

}