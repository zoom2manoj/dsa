package custom;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class AlienDictionary {

	public static void main(String[] args) {

		new AlienDictionary();

		// String[] arr ={ "baa", "abcd", "abca", "cab", "cad" };
		// int k = 4;

		// charArray(arr, k);

		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		for (int i = 0; i < t; i++) {
			int size = kb.nextInt();
			int k = kb.nextInt();

			String[] arr = new String[size];

			for (int j = 0; j < size; j++) {
				arr[j] = kb.next();
			}

			charArray(arr, k);

		}

	}

	private static void charArray(String[] arr, int k) {
		// TODO Auto-generated method stub

		Graph graph = new Graph(k);

		char[] cArray = new char[k];
		boolean[] visitedArr = new boolean[k];
		int counter = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			String word1 = arr[i];
			String word2 = arr[i + 1];

			for (int j = 0; j < Math.min(word1.length(), word2.length()); j++) {

				if (word1.charAt(j) != word2.charAt(j)) {

					graph.addEdge(word1.charAt(j) - 'a', word2.charAt(j) - 'a');
					break;

				}

			}

		}

		graph.topologicalSort();
	}

	static class Graph {

		LinkedList<Integer>[] adjacencyList;

		public Graph(int v) {

			adjacencyList = new LinkedList[v];

			for (int i = 0; i < v; i++) {
				adjacencyList[i] = new LinkedList<Integer>();
			}
		}

		public void addEdge(int v, int e) {
			adjacencyList[v].add(e);
		}

		int getNoofVertex() {
			return adjacencyList.length;
		}

		public void topologicalSort() {
			Stack<Integer> stack = new Stack<Integer>();

			boolean[] visited = new boolean[getNoofVertex()];
			for (int i = 0; i < visited.length; i++) {
				visited[i] = false;
			}

			for (int i = 0; i < getNoofVertex(); i++) {

				if (!visited[i]) {
					topologicalSortUtil(i, visited, stack);
				}

			}

			while (!stack.isEmpty()) {
				System.out.print((char) ('a' + stack.pop()) + " ");
			}
		}

		public void topologicalSortUtil(int i, boolean[] visited, Stack<Integer> stack) {

			visited[i] = true;
			for (int j : adjacencyList[i]) {
				if (!visited[j]) {
					topologicalSortUtil(j, visited, stack);
				}
			}

			stack.push(i);

		}
	}

}
