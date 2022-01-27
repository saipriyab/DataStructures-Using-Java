package com.learning.dll;

public class CreateDoubleLinkedList {

	private static ListNode head;
	private static ListNode tail;
	private static int length;

	public CreateDoubleLinkedList() {
		head = null;
		tail = null;
		length = 0;
	}

	private static class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data) {
			this.data = data;
		}
	}

	private boolean isEmpty() {
		return length == 0;
	}

	private int length() {
		return length;
	}
}
