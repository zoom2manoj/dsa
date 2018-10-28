package custom;

import java.util.Scanner;

public class LeftRotateMatrixKtimes {

	public static void main(String[] args) {
		//int m = 3;
		//int n = 4;
		
		//int m = 3;
		//int n = 3;
		
		
		//int k = 2;
		
		//leftSifted(m, n, k);
		
		
		
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		int m, n, k;
		for(int ii=0;ii<t;ii++){
		    m=kb.nextInt();
		    n=kb.nextInt();
		    k=kb.nextInt();
		    
		    int[][] matrix = new int[n][m];
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					matrix[i][j] = kb.nextInt();
					
					
				}
			}
			leftSifted(matrix, m, n, k);
		    
		}
		
	}
	
private static void leftSifted(int[][] matrix, int M, int N, int k) {
		
		
		int temp[]=new int[M]; 
		k = k % M; 
		for (int i = 0; i < N; i++) 
		{ 
		
			
			// copy first M-k elements 
						// to temporary array 
						for (int t = 0; t < M - k; t++) 
						temp[t] = matrix[i][t]; 
					
						// copy the elements from k 
						// to end to starting 
						for (int j = M - k; j < M; j++) 
							matrix[i][j - M + k] = matrix[i][j]; 
					
						// copy elements from 
						// temporary array to end 
						for (int j = k; j < M; j++) 
						matrix[i][j] = temp[j - k]; 
			
		} 
		
		
		
		displayMatrix(matrix, M, N);
		
	}

	private static void leftSifted(int M, int N, int k) {
		
		int[][] matrix = new int[N][M];
		
		int counter =1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				matrix[i][j] = counter;
				counter++;
				
			}
		}
		
		int matrix1[][] = {{12, 23, 34},  {45, 56, 67}, {78, 89, 91}};
		
		//matrix = matrix1;
		
		System.out.println(matrix);
		
		int temp[]=new int[M]; 
		
		
		k = k % M; 
		
		for (int i = 0; i < N; i++) 
		{ 
			// copy first M-k elements 
						// to temporary array 
						for (int t = 0; t < M - k; t++) 
						temp[t] = matrix[i][t]; 
					
						// copy the elements from k 
						// to end to starting 
						for (int j = M - k; j < M; j++) 
							matrix[i][j - M + k] = matrix[i][j]; 
					
						// copy elements from 
						// temporary array to end 
						for (int j = k; j < M; j++) 
						matrix[i][j] = temp[j - k]; 
			
		} 
		
		
		
		displayMatrix(matrix, M, N);
		
	}
	
	// function to display the matrix 
	static void displayMatrix(int matrix[][], int M, int N) 
	{ 
		for (int i = 0; i < N; i++) 
		{ 
			for (int j = 0; j < M; j++) 
			System.out.print(matrix[i][j] + " "); 
		} 
	} 
}
