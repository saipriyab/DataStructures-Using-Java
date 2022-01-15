package com.learning.sll;

public class MiddleNodeOfSLL {

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
		ListNode third = new ListNode(4);
		second.next = third;
		ListNode fourth = new ListNode(5);
		third.next = fourth;

		// find middle node
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		
		System.out.println(slowPtr.data);

	}

}
