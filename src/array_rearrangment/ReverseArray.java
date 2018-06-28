package array_rearrangment;

public class ReverseArray {

	public static void main(String[] args) {
		 int arr[] = {1, 2, 3, 4, 5, 6};
		 ReverseArray reverseArray = new ReverseArray();
		 reverseArray.printArray(arr);
		 System.out.println("");
		 reverseArray.reverse(arr);
		 reverseArray.printArray(arr);
	}


	private void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private void reverse(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}
}
