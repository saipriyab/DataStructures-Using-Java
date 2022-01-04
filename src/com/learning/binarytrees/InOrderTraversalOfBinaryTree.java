package com.learning.binarytrees;

public class InOrderTraversalOfBinaryTree {

	private static TreeNode head;

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

	private static void inOrderTraversal(TreeNode root) {
		if (root == null)
			return;
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}

	public static void main(String[] args) {
		head = new TreeNode(5);
		head.left = new TreeNode(2);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(1);
		head.left.right = new TreeNode(6);
		head.right.left = new TreeNode(7);
		
		inOrderTraversal(head);
	}

}
