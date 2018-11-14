package matrix;

public class MinStepsinInfiniteGrid {

	public static void main(String[] args) {
 
		//int[] A = {1, 3, 6, 8, 4};
		//int[] B = {1, 4, 5, 8, 4};
	
		int[] A = {0,1,2};
		int[] B = {0,1,2};
		
	
		
		int value =  pathLength(A, B);
		System.out.println(value);
		
		
	}

	public static int pathLength(int[] a, int[] b) {
		// TODO Auto-generated method stub
		
		int dif =0;
		for (int i = 0; i < b.length-1; i++) {
			
			int dx = Math.abs(a[i+1]- a[i]);
			int dy = Math.abs(b[i+1]- b[i]);
			dif+= Math.max(dx,  dy);
			
			
		}
		
		
		return dif;
	}
}
