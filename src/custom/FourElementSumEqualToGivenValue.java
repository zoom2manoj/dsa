package custom;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class FourElementSumEqualToGivenValue {

	public static void main(String[] args) {
		//FourElementSumEqualToGivenValue obj = new FourElementSumEqualToGivenValue();
		//int[] arr = {1, 5, 1, 0, 6, 0};
		//int sum = 7;
		
		
		//int[] arr = {38, 7, 44 ,42, 28, 16, 10, 37, 33, 2, 38, 29,26, 8, 25};
		//int sum = 22;
		
		
		//obj.isSumofFourElemenr(arr, sum);
		
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		for (int i = 0; i < t; i++) {
			int arraysize = kb.nextInt();
			int[] arr = new int[arraysize];
			for (int j = 0; j < arraysize; j++) {
				arr[j] = kb.nextInt();
			}
			
			int sum = kb.nextInt();
			isSumofFourElemenr(arr, sum);
		}
	}

	private static void isSumofFourElemenr(int[] arr, int sum) {

		HashMap<Integer, int[]> storeHash = new HashMap<Integer, int[]>();
				
				for (int i = 0; i < arr.length; i++) {
					for (int j = i+1; j < arr.length; j++) {
					
						int tempSum = arr[i]+arr[j];
						
						if (storeHash.containsKey(sum-tempSum)) {
							int[] tempArr = storeHash.get(sum-tempSum);
							if (tempArr[0]!=i&&tempArr[0]!=j&&tempArr[1]!=i&&tempArr[1]!=j) {
								System.out.println("1");
								return;
							}
						}
						
						int[] indexes = {i, j};
						storeHash.put(tempSum, indexes);
						
					}
				}
				
			System.out.println("0");
		
		
	}
}
