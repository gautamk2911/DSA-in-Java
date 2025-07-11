package binaryTrees;

import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class LevelOrderSum {

    public static int getLevelSum(TreeNode root, int k) {
        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int level = 0;
        int sum = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            level++;

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                if (level == k) {
                    sum += curr.data;
                }

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            if (level == k) break; // early stop
        }

        return sum;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int level = 3;
        int result = getLevelSum(root, level);
        System.out.println("Sum at level " + level + " = " + result); // Output: 4 + 5 + 6 + 7 = 22
    }
}
