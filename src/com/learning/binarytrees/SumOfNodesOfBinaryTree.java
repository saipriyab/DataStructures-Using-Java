package com.learning.binarytrees;

public class SumOfNodesOfBinaryTree {

	private static TreeNode head;
	private static int sum = 0;

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

	private static int calculateSum(TreeNode root) {
		if (root == null)
			return sum;
		else {
			sum = sum + root.data;
		}
		calculateSum(root.left);
		calculateSum(root.right);
		return sum;
	}

	public static void main(String[] args) {
		head = new TreeNode(5);
		head.left = new TreeNode(2);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(1);
		head.left.right = new TreeNode(6);
		head.right.left = new TreeNode(7);

		System.out.println(calculateSum(head));

	}

}
