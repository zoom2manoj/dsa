package array;

public class AntiDiagonals {
	
	public static void main(String[] args){
		
		int arr1[][]=
			{
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
			};
		
		
		
		int arr[][]={
		  {1, 2, 3},
		  {4, 5, 6},
		  {7, 8, 9}
};
		antiDaiag(arr);

}

	private static int[][] antiDaiag(int[][] A) {
		// TODO Auto-generated method stub
		
		int[][] result = new int[2*A.length-1][];
		
		for (int i = 0; i < 2*A.length-1; i++) {
			if (i<A.length) {
				
			
			int m =0;
			int n=i;
			int[] temp = new int[i+1];
			for (m=0; m <=i ; m++) {
				temp[m] =A[m][n];
				System.out.print(A[m][n]+" ");
				n--;
			}
			result[i] = temp;
			System.out.println("");
			}else{
				int m = i-A.length+1;
				int n = A.length-1;
				int[] temp = new int[A.length-m];
				int count =0;
				for (int j = m; j < A.length; j++) {
					temp[count] =A[j][n];
					System.out.print(A[j][n]+" ");
					n--;
					count++;
				}
				result[i] = temp;

				System.out.println("");
			}
			
		}
		
		return result;
		
	}
}