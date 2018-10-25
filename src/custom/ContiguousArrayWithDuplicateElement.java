package custom;

import java.util.HashSet;
import java.util.Scanner;

public class ContiguousArrayWithDuplicateElement {

	public static void main(String[] args) {
		//ContiguousArrayWithDuplicateElement obj = new ContiguousArrayWithDuplicateElement();
		// int[] arr = {5,2,3,6,4,4,6,6};
		//int[] arr = { 10, 14, 10, 12, 12, 13, 15 };

		//System.out.println("" + obj.check(arr, arr.length));
		
		
		Scanner kb = new Scanner(System.in);
	    int t = kb.nextInt();
	    for (int i = 0; i < t; i++) {
			int size = kb.nextInt();
			int[] arr = new int[size];
			
			
			for (int j = 0; j < size; j++) {
				arr[j] = kb.nextInt();			
			}
			
			
			System.out.println("" + check(arr, arr.length));
			
		}
		
	}

	private static String check(int[] arr, int n) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}

		int m = max - min + 1;

		if (m > n) {
			return "No";
		}

		boolean[] visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			visited[arr[i] - min] = true;
		}

		for (int i = 0; i < m; i++) {
			if (visited[i] == false) {
				return "No";
			}
		}

		return "Yes";

	}
}
