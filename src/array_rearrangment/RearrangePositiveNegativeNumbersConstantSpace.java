package array_rearrangment;

public class RearrangePositiveNegativeNumbersConstantSpace {
	
	//Rearrange positive and negative numbers with constant extra space	
	
	//Time complexity of above solution is O(n log n), O(Log n) space for recursive calls, and no additional data structure.
	public static void main(String[] args) {
		
	    int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

	    RearrangePositiveNegativeNumbersConstantSpace rearrangePositiveNegativeNumbersConstantSpace = new RearrangePositiveNegativeNumbersConstantSpace();
	    rearrangePositiveNegativeNumbersConstantSpace.print(arr);
	    rearrangePositiveNegativeNumbersConstantSpace.reverseArray(arr, 0, arr.length-1);
	    System.out.println("");
	    rearrangePositiveNegativeNumbersConstantSpace.print(arr);
	}

	private void reverseArray(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if (start<end) {
			
			int mid = start+(end-start)/2;
			
			reverseArray(arr, start, mid);
			reverseArray(arr, mid+1, end);
			merge(arr, start, mid, end);
			
			
		}
	}

	private void merge(int[] arr, int start, int mid, int end) {
		// TODO Auto-generated method stub
		
		int i = start;
		int j  = mid+1;
		
		while (i<=mid&& arr[i]<0) {
			i++;
		}
		
		while (j<=end&&arr[j]<0) {
			j++;
		}
		
		reverse(arr, i, mid);
		reverse(arr, j, end);
		reverse(arr, i, j-1);
		
		
	}

	private void reverse(int[] arr, int i, int mid) {
		// TODO Auto-generated method stub
		
		if (i<mid) {
			swap(arr, i, mid);
			reverse(arr, ++i, --mid);
		}
		
	}

	private void swap(int[] arr, int i, int mid) {
		// TODO Auto-generated method stub
		int temp  = arr[i];
		arr[i]= arr[mid];
		arr[mid] = temp;
	}

	private void print(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	

}
