package array_rotations;

public class Reversal_ArrayRotation {

	
	public static void main(String[] args) {
		Reversal_ArrayRotation reversal_ArrayRotation = new Reversal_ArrayRotation();
		int[] arr = {1,2,3,4,5,6,7};
		reversal_ArrayRotation.arrayReverse(arr, 2);
		reversal_ArrayRotation.printArray(arr);
		
	}

	private void arrayReverse(int[] arr, int d) {
		// TODO Auto-generated method stub
		
		int n = arr.length;
		
		reverseRotation(arr, 0, d-1);
		reverseRotation(arr, d, n-1);
		reverseRotation(arr, 0, n-1);
		
	}

	private void reverseRotation(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		while (start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end--;
			start++;
			
		}
	}

	private  void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
	
	
	
	
	
}
