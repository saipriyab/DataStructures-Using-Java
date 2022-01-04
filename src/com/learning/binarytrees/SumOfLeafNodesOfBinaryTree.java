package com.learning.binarytrees;

import org.w3c.dom.Node;

public class SumOfLeafNodesOfBinaryTree {
	
	private static TreeNode head;
	private static int sum=0;
	
	private static class TreeNode
	{
		private int data;
		private TreeNode left;
		private TreeNode right;
		public TreeNode(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	private static int sumOfLeafNodes(TreeNode root)
	{
		if(root==null)
			return 0;
		if(root.left==null&&root.right==null)
			return root.data;
		return sum+sumOfLeafNodes(root.left)+sumOfLeafNodes(root.right);
	}

	public static void main(String[] args) {
		head = new TreeNode(5);
		head.left = new TreeNode(2);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(1);
		head.left.right = new TreeNode(6);
		head.right.left = new TreeNode(7);
        System.out.println(sumOfLeafNodes(head));
	}

}
