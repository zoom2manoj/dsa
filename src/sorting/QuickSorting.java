package sorting;

public class QuickSorting {

	
	//Quick sort is good for arrays as compare to linkedlist
	//Quick sort is general form in-place sort where merge sort required O(n) extra storage. Allocating and de-allocating the extra space used in merge sort increase the running time of algorithm. 
	//Merge sort is good for linkedlist as compare to Arrays
	//1. Listedlist nodes may not be adjacent in memory so 
	//2. Insert item in linkedlist with O(1) exra stroage & O(1) time complexity
	//3. Random access is very issue in array as compare to linkedlist 
	public static void main(String[] args){
        int arr[] = {10, 7, 8, 9, 1, 5};
        QuickSorting ob = new QuickSorting();
        ob.print(arr);
        ob.sorting(arr, 0, arr.length-1);
        ob.print(arr);
	}

	private void print(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("====");
	}

	private void sorting(int[] arr, int start, int total) {
		// TODO Auto-generated method stub

		
		if (start<total) {
			int pi = partition(arr, start, total);
			sorting(arr, start, pi-1);
			sorting(arr, pi+1, total);
		}
				
				
		
		
	}

	private int partition(int[] arr, int start, int total) {
		// TODO Auto-generated method stub
		
		int j=0;
		int i=-1;
		int pivot = arr[total];
		
		
		for (j = 0; j < total; j++) {
			
			if(arr[j]<=pivot){
				i++;
				swap(arr, i, j);
			}
			
		}
		
		//print(arr);
		
		swap(arr, i+1, j);
		return i+1;
	}

	private void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if (i!=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
