package custom;

import java.util.Scanner;

public class LeftRotateMatrixKtimes {

	public static void main(String[] args) {
		// int m = 3;
		// int n = 4;

		// int m = 3;
		// int n = 3;

		// int k = 2;

		// leftSifted(m, n, k);

		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		int rows, colums, kthsSifting;
		for (int ii = 0; ii < t; ii++) {
			rows = kb.nextInt();
			colums = kb.nextInt();
			kthsSifting = kb.nextInt();

			int[][] matrix = new int[rows][colums];

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < colums; j++) {
					matrix[i][j] = kb.nextInt();

				}
			}
			leftSifted(matrix, rows, colums, kthsSifting);

		}

	}

	private static void leftSifted(int[][] matrix, int rows, int colums, int kthsifting) {

		int temp[] = new int[colums];
		kthsifting = kthsifting % colums;
		for (int i = 0; i < rows; i++) {

			for (int t = 0; t < kthsifting; t++) {
				temp[t] = matrix[i][t];
			}

			for (int j = kthsifting; j < colums; j++)
				matrix[i][j - kthsifting] = matrix[i][j];

			for (int j = 0; j < kthsifting; j++)
				matrix[i][colums + j - kthsifting] = temp[j];


		}

		displayMatrix(matrix, rows, colums);
		System.out.println("");

	}

	// function to display the matrix
	static void displayMatrix(int matrix[][], int M, int N) {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(matrix[i][j] + " ");
		}
	}
}
