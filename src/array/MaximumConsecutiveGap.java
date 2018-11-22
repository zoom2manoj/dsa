package array;

import java.util.Arrays;

public class MaximumConsecutiveGap {
	public static void main(String[] args) {
		int[] A = {1, 10, 5};
		System.out.println(maximumGap(A));
	}

	public static int maximumGap(final int[] A) {
		
		
		if (A.length<2) {
			return 0;
		}
		Arrays.sort(A);
		int maxDiff = 0;
		
		
		for (int i = 1; i < A.length; i++) {
			int diff = A[i]-A[i-1];
			if ( maxDiff<diff) {
				maxDiff = diff;
			}
		}
		
		
		return maxDiff;
    }
}
