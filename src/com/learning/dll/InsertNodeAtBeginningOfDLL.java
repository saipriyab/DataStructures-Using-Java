package com.learning.dll;


public class InsertNodeAtBeginningOfDLL {
	
	private static ListNode head;
	private static ListNode tail;
	private static int length;
	
	public InsertNodeAtBeginningOfDLL()
	{
		this.head=null;
		this.tail=null;
		this.length=0;
	}

	private static class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data) {
			this.data = data;
		}
	}
	
	private static void insertNodeAtBeginning(int data)
	{
		ListNode newNode=new ListNode(data);
		if(tail==null)
			tail=newNode;
		else
		{
			head.previous=newNode;
		}
		newNode.next=head;
		head=newNode;
		length++;
	}
	
	private static void printInForwardDirection() {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		InsertNodeAtBeginningOfDLL.insertNodeAtBeginning(1);
		InsertNodeAtBeginningOfDLL.insertNodeAtBeginning(10);
		InsertNodeAtBeginningOfDLL.insertNodeAtBeginning(15);
		InsertNodeAtBeginningOfDLL.insertNodeAtBeginning(25);
		InsertNodeAtBeginningOfDLL.printInForwardDirection();

	}

}
