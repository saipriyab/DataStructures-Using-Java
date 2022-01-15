package com.learning.sll;


public class InsertNodeAtEndOfSLL {
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

		ListNode temp=head;
		//insert node at end
		ListNode newNode=new ListNode(7);
		while (head.next != null) {
		   head=head.next;
		}
		head.next=newNode;
		
		// print elements
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");

	}
}
