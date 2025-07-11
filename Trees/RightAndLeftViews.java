public static void leftView(TreeNode root) {
		if(root == null) {
			return;
		}
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			int levelSize = q.size();
			for(int i = 0;i<levelSize;i++) {
				TreeNode curr = q.poll();
				
				if(i == 0) {
					System.out.print(curr.data+" ");
				}
				if(curr.left != null) {
					q.add(curr.left);
				}
				if(curr.right  != null) {
					q.add(curr.right);
				}
				
			}
		}
	}
	
	public static void rightView(TreeNode root) {
		if(root == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			int levelSize = q.size();
			
			for(int i=0;i<levelSize;i++) {
				TreeNode curr  = q.poll();
				if(i == levelSize-1) {
					System.out.print(curr.data+" ");
				}
				
				if(curr.right != null) {
					q.add(curr.right);
				}
				if(curr.left != null) {
					q.add(curr.left);
				}
			}
		
		
		}
		
	}
