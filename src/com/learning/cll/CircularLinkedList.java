package com.learning.cll;

public class CircularLinkedList {

	private ListNode last;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void createSingleLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);

		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last=fourth;
	}

	public void traverse() {
		ListNode first = last.next;
		while (first != last) {
			System.out.print(first.data + " ");
			first = first.next;
		}
		System.out.print(first.data);
	}

	public static void main(String[] args) {
		CircularLinkedList cll=new CircularLinkedList();
		cll.createSingleLinkedList();
		cll.traverse();
	}

}
