package sorting;

import java.util.Vector;

public class BucketSorting {

	
	
	public static void main(String[] args){
		
	    float arr[] = {(float) 0.897, (float) 0.565, (float) 0.656, (float) 0.1234, (float) 0.665, (float) 0.3434};
	    BucketSorting bucketSorting = new BucketSorting();
	    bucketSorting.sorting(arr, arr.length);
	    bucketSorting.print(arr);
	}

	private void print(float[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private void sorting(float[] arr, int length) {
		// TODO Auto-generated method stub
		Vector<Float> b = new Vector<Float>(length);
		
		for (int i = 0; i < arr.length; i++) {
			int bi = (int) (length*arr[i]);
			b.add(bi, arr[i]);
		}
	}
}
