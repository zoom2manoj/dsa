package array;

import java.util.Arrays;

public class WaveArray {

	public static void main(String[] args) {
		//int[] array = { 1, 2, 3, 4 };
		int[] array = {  5, 1, 3, 2, 4 };
		wave(array);
	}

	public static int[] wave(int[] A) {

		// a1 >= a2 <= a3 >= a4 <= a5.....
		Arrays.sort(A); 
		for (int i = 0; i < A.length - 1; i += 2) {

			if (i > 0 && A[i - 1] > A[i])
				swap(A, i - 1, i);

			// If current even element is smaller
			// than next
			if (i < A.length - 1 && A[i] < A[i + 1])
				swap(A, i, i + 1);

		}
		
		printArray(A);

		return A;
	}

	private static void swap(int[] arr, int a, int b) {
		// TODO Auto-generated method stub
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
