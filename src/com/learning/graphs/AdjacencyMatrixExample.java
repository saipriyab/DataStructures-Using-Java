package com.learning.graphs;

public class AdjacencyMatrixExample {

	private int[][] adjMatrix;
	private int E = 0;
	private int V = 0;

	public AdjacencyMatrixExample(int nodes) {
		adjMatrix = new int[nodes][nodes];
		V = nodes;
	}

	public void addEdge(int u, int v) {
		adjMatrix[u][v] = 1;
		adjMatrix[v][u] = 1;
		E++;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("V :" + V + "E" + E);
		sb.append("\n");
		for (int i = 0; i < V; i++) {
			sb.append(i + ":");
			for (int w : adjMatrix[i]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		AdjacencyMatrixExample matrix=new AdjacencyMatrixExample(4);
		matrix.addEdge(0, 1);
		matrix.addEdge(1,2);
		matrix.addEdge(2, 3);
		matrix.addEdge(3, 0);
		System.out.println(matrix);

	}

}
