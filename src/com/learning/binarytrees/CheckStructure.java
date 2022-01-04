package com.learning.binarytrees;

public class CheckStructure {

	private static TreeNode head1;
	private static TreeNode head2;

	private static class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	private static boolean checkStructure(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		return root1.data == root2.data && checkStructure(root1.left, root2.left)
				&& checkStructure(root1.right, root2.right);
	}

	public static void main(String[] args) {
		head1 = new TreeNode(5);
		head1.left = new TreeNode(2);
		head1.right = new TreeNode(3);
		head1.left.left = new TreeNode(1);
		head1.left.right = new TreeNode(6);
		head1.right.left = new TreeNode(7);
		
		head2 = new TreeNode(5);
		head2.left = new TreeNode(2);
		head2.right = new TreeNode(3);
		head2.left.left = new TreeNode(1);
		head2.left.right = new TreeNode(6);
		head2.right.left = new TreeNode(7);
		
		System.out.print(checkStructure(head1,head2));


	}

}
