package array_rotations;

public class BlockSwapRotation {

	public static void main(String[] args) {
		 int arr[] = {1, 2, 3, 4, 5, 6, 7};
		 int k =2;
		 BlockSwapRotation blockSwapRotation = new BlockSwapRotation();
		 blockSwapRotation.rotateArray(arr, k, arr.length);
		 blockSwapRotation.printArray(arr);
		 
	}
	
	
	
	private void rotateArray(int[] arr, int d, int n) {		

		rotateArrayLeft(arr, 0, n-1, d, n-d);	

	}
	
	
	private void rotateArrayLeft(int[] arr, int startIndex, int endIndex, int leftsize, int rightsize) {

		if (leftsize==rightsize) {
			swap(arr, startIndex, startIndex+rightsize, rightsize);
		}else if (leftsize<rightsize) {
			swap(arr, startIndex, endIndex-leftsize+1, leftsize);
			rotateArrayLeft(arr, startIndex, endIndex-leftsize, leftsize, rightsize-leftsize);
		}else {
			swap(arr, startIndex, endIndex-rightsize+1, rightsize);
			rotateArrayLeft(arr, startIndex+rightsize, endIndex, leftsize-rightsize, rightsize);
		}
	}
	
	
	private void swap(int[] arr, int index1, int index2, int d) {
		
		for (int i = 0; i < d; i++) {
			int temp  =  arr[index1+i];
			arr[index1+i] = arr[index2+i];
			arr[index2+i] = temp;
		}

	}
	
	private void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
