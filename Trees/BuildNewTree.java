package binaryTrees;
import java.util.*;


class TreeNode{
	int data;
	TreeNode right;
	TreeNode left;
	
	public TreeNode(int val) {
		data = val;
		left = right = null;
	}
}


public class BuildNewTree {
	public static TreeNode buildTree() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter root value: ");
		int rootVal = sc.nextInt();
		
		TreeNode root = new TreeNode(rootVal);
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		
		
		while(!q.isEmpty()) {
			TreeNode curr = q.poll();
			System.out.print("Enter left child data of "+curr.data+" :");
			int leftVal = sc.nextInt();
			if(leftVal != -1) {
				curr.left = new TreeNode(leftVal);
				q.add(curr.left);
			}
			System.out.print("Enter right child of "+ curr.data+" :");
			int rightVal = sc.nextInt();
			if(rightVal != -1) {
				curr.right = new TreeNode(rightVal);
				q.add(curr.right);
			}	
		}
		sc.close();
		return root;
		
	}
	
	public static void levelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = buildTree();
        System.out.println("Level Order Traversal:");
        levelOrder(root);
    }
}
