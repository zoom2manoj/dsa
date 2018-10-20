package custom;

import java.util.Arrays;

public class PlatformNeedOnRailwayStation {

	
	public static void main(String[] args) {
		int arr[] = {900, 940, 950, 1100, 1500, 1800}; 
	    int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; 
	    int n = arr.length; 
	    System.out.println("Minimum Number of Platforms Required = " + new PlatformNeedOnRailwayStation().PlatfindPlatform(arr, dep, n)); 
	}

	private int  PlatfindPlatform(int[] arr, int[] dep, int n) {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int result = 0;
		int needPlatform =1;
		int i=1;
		int j=0;
		
		while (i<n&& j<n) {
			
			if (arr[i]<=dep[j]) {
				needPlatform++;
				if (needPlatform>result) {
					result = needPlatform;
				}
				i++;
			}else {
				needPlatform--;
				j++;
			}
			
			
		}
		
		
		
		return result;
	}
}
