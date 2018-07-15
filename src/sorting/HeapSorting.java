package sorting;

public class HeapSorting {

	
	public static void main(String[] args){
		
        int arr[] = {12, 11, 13, 5, 6, 7};
        HeapSorting  heapSorting =  new HeapSorting();
        
        heapSorting.sort(arr);
        heapSorting.print(arr);
	}

	

	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		
		for (int i = n/2-1; i >=0; i--) {
			
			heapify(arr, n, i);
		}
		
		
		for (int i = n-1; i >=0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			heapify(arr, i, 0);
		}
	}



	private void heapify(int[] arr, int n, int i) {
		// TODO Auto-generated method stub
		
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		if (left<n && arr[left]>arr[largest]) {
			largest = left;
		}
		
		if (right<n && arr[right]>arr[largest]) {
			largest = right;
		}
		
		if (largest!= i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			
			heapify(arr, n, largest);
		}
	}



	private void print(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
}
