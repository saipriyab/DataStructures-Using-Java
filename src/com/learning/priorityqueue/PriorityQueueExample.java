package com.learning.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
	private int rank;
	private String name;

	public Student(String name, int rank) {
		super();
		this.rank = rank;
		this.name = name;
	}

	@Override
	public int compareTo(Student st) {
		if (rank < st.rank)
			return -1;
		else if (rank > st.rank)
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "Student [rank=" + rank + ", name=" + name + "]";
	}

}

public class PriorityQueueExample {
	public static void main(String args[]) {
		PriorityQueue<Student> studentQ = new PriorityQueue<>();
		studentQ.add(new Student("a", 5));
		studentQ.add(new Student("b", 3));
		studentQ.add(new Student("c", 1));
		studentQ.add(new Student("d", 4));
		studentQ.add(new Student("e", 2));

		System.out.println(studentQ.size());

		Iterator it = studentQ.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}
	}
}
