package com.learning.binarytrees;

public class CountLeafNodesOfBinaryTree {

	private static TreeNode head;
	private static int count = 0;

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

	private static int countLeafNodes(TreeNode root) {
		if (root == null)
			return count;
		if (root.left == null && root.right == null) {
			count = count + 1;
		}
		countLeafNodes(root.left);
		countLeafNodes(root.right);
		return count;

	}

	public static void main(String[] args) {
		head = new TreeNode(5);
		head.left = new TreeNode(2);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(1);
		head.left.right = new TreeNode(6);
		head.right.left = new TreeNode(7);
		
		System.out.println(countLeafNodes(head));

	}

}
