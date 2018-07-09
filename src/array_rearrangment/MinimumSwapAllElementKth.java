package array_rearrangment;

public class MinimumSwapAllElementKth {

	
	public static void main(String[] args) {
	    int arr[] = {2, 7, 9, 5, 8, 7, 4};
	    int k = 5;
	    MinimumSwapAllElementKth minimumSwapAllElementKth = new  MinimumSwapAllElementKth();
	    minimumSwapAllElementKth.minSwap(arr, k);
	    
	}

	private void minSwap(int[] arr, int k) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<=k) {
				count++;
			}
		}
		
		int bad =0;
		for (int i = 0; i < count; i++) {
			if (arr[i]>k) {
				bad++;
			}
		}
		
		
		int ans = bad;
		
		for(int i=0, j=count; j<arr.length; i++, j++) {
			if(arr[i]>k) {
				bad--;
			}
			
			if(arr[j]>k) {
				bad++;
			}
			ans = Math.min(ans, bad);
		}
		
		System.out.println(ans);
	}

	
}
