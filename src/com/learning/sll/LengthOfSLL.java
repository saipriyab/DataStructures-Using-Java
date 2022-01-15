package com.learning.sll;

public class LengthOfSLL {
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

		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}

		System.out.println(count);
	}
}
