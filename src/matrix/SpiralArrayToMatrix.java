package matrix;

public class SpiralArrayToMatrix {

	public static void main(String[] args) {
		createMatrix(4);
	}

	private static void createMatrix(int A) {
		// TODO Auto-generated method stub

		int[][] mat = new int[A][A];

		int k = 0, l = 0, m = A, n1 = A;
		int count=0;

		while (k < m && l < n1) {

			for (int i = k; i < n1 ; i++) {
				
					mat[k][i] = ++count;
				

			}
			k++;
			
			for (int i = k; i < n1; i++) {
				mat[i][m-1] = ++count;
			}
			m--;

			
			for (int i = m-1; i>=l ; i--) {
				mat[n1-1][i] = ++count;
			}
			
			n1--;
			
			for (int i = n1-1; i >=k; i--) {
				mat[i][l] = ++count;
			}
			l++;
			
		}

		System.out.println("");
	}
}
