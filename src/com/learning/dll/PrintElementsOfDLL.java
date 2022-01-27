package com.learning.dll;

public class PrintElementsOfDLL {

	private static ListNode head;
	private static ListNode tail;
	private static int length;

	public PrintElementsOfDLL() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	private static void insertAtLast(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null)
			head = newNode;
		else {
			tail.next = newNode;
		}
		newNode.previous = tail;
		tail = newNode;
		length++;
	}

	private static class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data) {
			this.data = data;
		}
	}

	private static void printInForwardDirection() {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	private static void printInBackwardDirection() {
		ListNode temp = tail;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp=temp.previous;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		PrintElementsOfDLL.insertAtLast(1);
		PrintElementsOfDLL.insertAtLast(10);
		PrintElementsOfDLL.insertAtLast(15);
		PrintElementsOfDLL.insertAtLast(25);
		PrintElementsOfDLL.printInForwardDirection();
		PrintElementsOfDLL.printInBackwardDirection();
	}

}
