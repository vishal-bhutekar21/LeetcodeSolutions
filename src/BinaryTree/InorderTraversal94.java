package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal94 {

    // -------- TreeNode Definition --------
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // -------- Main Method --------
    public static void main(String[] args) {

        /*
              Example Tree:
                    1
                     \
                      2
                     /
                    3
              Expected Output: [1, 3, 2]
        */

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InorderTraversal94 obj = new InorderTraversal94();
        List<Integer> result = obj.inorderTraversal(root);

        System.out.println("Inorder Traversal: " + result);
    }

    // -------- Inorder Traversal Function --------
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        inorder(node.left, result);     // Left
        result.add(node.val);           // Node
        inorder(node.right, result);    // Right
    }
}
