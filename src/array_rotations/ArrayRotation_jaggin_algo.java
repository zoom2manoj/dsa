package array_rotations;

public class ArrayRotation_jaggin_algo {
	
	
	public static void main(String[] arg) {
		
		
		ArrayRotation_jaggin_algo rotate = new ArrayRotation_jaggin_algo();
	        int arr[] = {1, 2, 3, 4, 5, 6, 7};
	        rotate.leftRotate(arr, 2, 7);
	        rotate.printArray(arr, 7);
	}

	private void printArray(int[] arr, int size) {

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private void leftRotate(int[] arr, int d, int n) {
		int i, j, k, temp;
		
		for (i = 0; i < gcb(d, n); i++) {
			
			temp = arr[i];
			j = i;
			
			while(true) {
				k=j+d;
				if(k>=n)
					k = k-n;
				if(k==i)
					break;
				
				arr[j] = arr[k];
				j= k;
			}
			arr[j] = temp;
		}
		
		
	}

	private int gcb(int d, int n) {
		// TODO Auto-generated method stub
		
		if (n==0) 
			return d;
		else 
			return gcb(n, d%n);
		
	}

}
