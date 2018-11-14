package matrix;

public class MatrixIntoSpiral {

	public static void main(String[] args) {
		int[][] matr = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16},
				{17, 18, 19, 20}
				};
		
		int[] spiralArr = spiralConverter(matr);
		//printArr(spiralArr);
	}

	private static void printArr(int[] spiralArr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < spiralArr.length; i++) {
			System.out.print(spiralArr[i]+" ");
		}
	}

	private static int[] spiralConverter(int[][] matr) {
		// TODO Auto-generated method stub
		
		int m = matr.length, n = matr[0].length, k=0, l=0;
		
		
		
		while (k<m && l<n) {
			
			for (int i = k; i < n; i++) {
				System.out.print(matr[k][i]+" ");
			}
			k++;
			
			for (int i = k; i < m; i++) {
				System.out.print(matr[i][n-1]+" ");
			}
			n--;
			
			for (int i = n-1; i >=l; i--) {
				System.out.print(matr[m-1][i]+" ");
			}
			m--;
			
			for (int i = m-1; i >=k ; i--) {
				System.out.print(matr[i][l]+" ");
			}
			l++;
		}
		
		
		
		return null;
	}
}
