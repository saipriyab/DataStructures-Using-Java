package com.learning.graphs;

import java.util.LinkedList;

public class AdjacencyListExample {

	private int V;
	private int E;
	private LinkedList<Integer>[] adjList;

	public AdjacencyListExample(int nodes) {
		adjList = new LinkedList[nodes];
		for (int i = 0; i < nodes; i++)
			adjList[i] = new LinkedList<>();
		V = nodes;
	}

	public void addEdge(int u, int v) {
		adjList[u].add(v);
		adjList[v].add(u);
		E++;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("V :" + V + "E" + E);
		sb.append("\n");
		for (int i = 0; i < V; i++) {
			sb.append(i + " :");
			for (int w : adjList[i]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		AdjacencyListExample list = new AdjacencyListExample(4);
		list.addEdge(0, 1);
		list.addEdge(1, 2);
		list.addEdge(2, 3);
		list.addEdge(3, 0);
		System.out.println(list);
	}

}
