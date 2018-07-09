package sorting;

public class MergeSortArray {

	public static void main(String[] args){
		MergeSortArray mergeSortArray =  new MergeSortArray();
        int arr[] = {12, 11, 13, 5, 6, 7};
        mergeSortArray.print(arr);
		mergeSortArray.sort(arr, 0, arr.length-1);
		mergeSortArray.print(arr);
	}

	private void print(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("============");
		System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int count = 0;
	private void sort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if (i<j) {
			System.out.println("\nprocess: "+count);
			count++;
			int mid = i+(j-i)/2;
			sort(arr, i, mid);
			sort(arr, mid+1, j);
			
			merge(arr, i, mid, j);
			
		}
	}

	private void merge(int[] arr, int i, int mid, int j) {
		// TODO Auto-generated method stub
		int n1 = mid-i+1;
		int n2 = j-mid;
		
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		int t=0;
		for (int k = 0; k < n1; k++) {
			arr1[k] = arr[k+i];
		}
		
		for (int k = 0; k < n2; k++) {
			arr2[k] = arr[k+mid+1];
		}
		
		
		int m = 0;
		int n = 0;
		int k = i;
		while (m<n1 && n<n2) {
			if (arr1[m]<=arr2[n]) {
				arr[k] = arr1[m];
				k++;
				m++;
			}else{
				arr[k] = arr2[n];
				k++;
				n++;
			}
		}
		
		while (m<n1) {
			arr[k]= arr1[m];
			k++;
			m++;
		}
		
		while (n<n2) {
			arr[k] = arr2[n];
			k++;
			n++;
		}
		print(arr1);
		print(arr2);
	}
}
