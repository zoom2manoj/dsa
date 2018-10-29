package custom;

import java.util.Arrays;

public class AlienDictionary {

	
	public static void main(String[] args) {
		
		new AlienDictionary();
		
		String[] arr ={ "baa", "abcd", "abca", "cab", "cad" };
		int k = 4;
		
		charArray(arr, k);
		
	}

	private static void charArray(String[] arr, int k) {
		// TODO Auto-generated method stub
		char[] cArray = new char[k];
		boolean[] visitedArr = new boolean[k];
		int counter =0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (counter<k) {
				cArray[counter]= arr[i].charAt(0);
				counter++;
			}			
		}
		
		System.out.println(Arrays.toString(cArray));
	}
	
}
