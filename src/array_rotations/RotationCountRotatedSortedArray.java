package array_rotations;

public class RotationCountRotatedSortedArray {

	public static void main(String[] args) {
		
		int arr[] = {15, 18, 2, 3, 6, 12};
		RotationCountRotatedSortedArray rotatedSortedArray = new RotationCountRotatedSortedArray();
		int value = rotatedSortedArray.rotationCount(arr, 0, arr.length-1);
		System.out.println(value);
	}

	private int rotationCount(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
		if(high<low) {
			return 0;
		}
		if (high==low) {
			return low;
		}
		
		
		int mid = low+(high-low)/2;
		
		
		if (mid<high && arr[mid+1]<arr[mid]) {
			return mid+1;
		}
		
		if(mid>low && arr[mid]<arr[mid-1]) {
			return mid;
		}
	
		if (arr[high]>arr[mid]) {
			return rotationCount(arr, low, mid-1);
		}else {
			return rotationCount(arr, mid+1, high);
		}
	}
}
