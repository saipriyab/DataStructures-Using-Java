package com.learning.sll;


public class PrintElementsOfSLL {

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

		// print elements
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print("null");

	}

}
