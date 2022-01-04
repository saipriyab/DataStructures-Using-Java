package com.learning.binarytrees;

public class CountNodesOfBinaryTree {

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

	private static int countNodesOfBinaryTree(TreeNode root) {
		if (root == null)
			return count;
		else {
			count++;
		}
		countNodesOfBinaryTree(root.left);
		countNodesOfBinaryTree(root.right);
		return count;
	}

	public static void main(String[] args) {
		head = new TreeNode(5);
		head.left = new TreeNode(2);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(1);
		head.left.right = new TreeNode(6);
		head.right.left = new TreeNode(7);

		System.out.println(countNodesOfBinaryTree(head));
	}

}
