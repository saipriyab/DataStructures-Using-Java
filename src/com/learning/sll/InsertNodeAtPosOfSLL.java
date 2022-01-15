package com.learning.sll;


public class InsertNodeAtPosOfSLL {
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
		head = new ListNode(1);
		ListNode first = new ListNode(2);
		head.next = first;
		ListNode second = new ListNode(3);
		first.next = second;
		ListNode third = new ListNode(5);
		second.next = third;
		ListNode fourth = new ListNode(6);
		third.next = fourth;

		int pos = 4, count = 1;
		ListNode newNode = new ListNode(4);
		ListNode prev = head;
		ListNode temp = head;
		while (count < pos - 1) {
			count++;
			prev = prev.next;
		}

		newNode.next = prev.next;
		prev.next = newNode;

		// print elements
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}
}
