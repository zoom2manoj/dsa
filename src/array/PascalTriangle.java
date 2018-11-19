package array;

public class PascalTriangle {

	/*
	 * Given numRows, generate the first numRows of Pascal’s triangle.
	 * 
	 * Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from
	 * previous row R - 1.
	 * 
	 * Example:
	 * 
	 * Given numRows = 5,
	 * 
	 * Return
	 * 
	 * [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]
	 */

	public static void main(String[] args) {

		int[][] ja = pascalTri(5);
		System.out.println("");

	}

	private static int[][] pascalTri(int A) {
		// TODO Auto-generated method stub

		int[][] arr = new int[A][];

		for (int i = 0; i < A; i++) {

			if (i == 0) {
				int[] temp1 = { 1 };
				arr[i] = temp1;
			} else {
				int[] temp = new int[i + 1];
				int[] gt = arr[i - 1];
				for (int j = 0; j < temp.length; j++) {
					if (j == 0) {
						temp[j] = gt[j];
					} else if (j == temp.length - 1) {
						temp[j] = gt[j - 1];
					} else {
						temp[j] = gt[j] + gt[j - 1];
					}

				}
				arr[i] = temp;
			}

		}

		return arr;
	}
}
