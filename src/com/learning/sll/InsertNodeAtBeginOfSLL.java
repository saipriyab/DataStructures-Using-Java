package com.learning.sll;

public class InsertNodeAtBeginOfSLL {
	private static ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		head = new ListNode(2);
		ListNode first = new ListNode(3);
		head.next = first;
		ListNode second = new ListNode(4);
		first.next = second;
		ListNode third = new ListNode(5);
		second.next = third;
		ListNode fourth = new ListNode(6);
		third.next = fourth;

		//insert node at beginning
		ListNode newNode=new ListNode(1);
		newNode.next=head;
		head=newNode;
		
		// print elements
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print("null");

	}
}
