package custom;

import java.util.HashSet;

public class ContiguousArrayWithDuplicateElement {

	public static void main(String[] args) {
		ContiguousArrayWithDuplicateElement obj = new ContiguousArrayWithDuplicateElement();
		// int[] arr = {5,2,3,6,4,4,6,6};
		int[] arr = { 10, 14, 10, 12, 12, 13, 15 };

		System.out.println("" + obj.check(arr, arr.length));
	}

	private boolean check(int[] arr, int n) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}

		int m = max - min + 1;

		if (m > n) {
			return false;
		}

		boolean[] visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			visited[arr[i] - min] = true;
		}

		for (int i = 0; i < m; i++) {
			if (visited[i] == false) {
				return false;
			}
		}

		return true;

	}
}
