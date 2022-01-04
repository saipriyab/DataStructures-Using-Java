package com.learning.binarytrees;

public class MinMaxOfBinaryTree {

	private static TreeNode head;
	private static int min = -1;
	private static int max = 0;

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

	private static void findMaxAndMin(TreeNode root) {
		if (root == null)
			return;
		if (min==-1) {
			min = root.data;
		}
		if(root.data<min)
		{
			min=root.data;
		}
		if (root.data > max) {
			max = root.data;
		}
		findMaxAndMin(root.left);
		findMaxAndMin(root.right);
	}

	public static void main(String[] args) {
		head = new TreeNode(5);
		head.left = new TreeNode(2);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(8);
		head.left.right = new TreeNode(6);
		head.right.left = new TreeNode(7);
		
		findMaxAndMin(head);
		
		System.out.println("Max value is"+MinMaxOfBinaryTree.max);
		System.out.println("Min value is"+MinMaxOfBinaryTree.min);
	}

}
