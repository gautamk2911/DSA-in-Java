package binaryTrees;

public class BinaryTreeStructure {
	static class TreeNode{
		 int data;
		 TreeNode left;
		 TreeNode right;
		
		public TreeNode(int val){
			data = val;
			left  = right = null;
		}	
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right  = new TreeNode(3);
		
		System.out.println(root.data);
		System.out.println(root.left.data);
		System.out.println(root.right.data);
		
	}

}
