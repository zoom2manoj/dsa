package array_rearrangment;

public class AllNegativeElementsEndInorder {

	public static void main(String[] args) {
        int arr[] = { 1, -1, -3, -2, 7, 5, 11, 6 };

		AllNegativeElementsEndInorder allNegativeElementsEndInorder= new AllNegativeElementsEndInorder();
		allNegativeElementsEndInorder.move(arr);
		allNegativeElementsEndInorder.print(arr);
	}

	private void print(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private void move(int[] arr) {
		
		int i=arr.length-1;
		
		for (int j = arr.length-1; j >=0; j--) {
			
			if (arr[j]<0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i--;
			}
			
		}
		
	}
}
