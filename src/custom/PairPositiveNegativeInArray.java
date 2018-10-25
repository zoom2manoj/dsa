package custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class PairPositiveNegativeInArray {

	public static void main(String[] args) {

		
//		2
	//	9
		//-241 76 137 -594 -367 -234 817 -438 -401 
//		9
	//	-279 -188 -77 -461 -778 -179 -475 -581 -564
		
		//int[] arr = { 		-241, 76, 137, -594, -367, -234, 817, -438, -401 };
		//int[] arr = { 1, -3, 2, 3, 6, -1 };

		//findPair(arr);
		
		
		Scanner kb = new Scanner(System.in);
	    int t = kb.nextInt();
	    for (int i = 0; i < t; i++) {
			int size = kb.nextInt();
			int[] arr = new int[size];

			
			for (int j = 0; j < size; j++) {
				arr[j] = kb.nextInt();			
			}
			
			findPair(arr);
			
			
		}

	}

	private static void findPair(int[] arr) {
		// TODO Auto-generated method stub

		List<Integer> arrList = new ArrayList<Integer>();
		
		HashMap<Integer, Integer> counterMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			
			if (counterMap.containsKey(Math.abs(arr[i]))) {
				counterMap.put(Math.abs(arr[i]),1);				
				arrList.add(Math.abs(arr[i]));
			}else {
				counterMap.put(Math.abs(arr[i]),0);
			}
		}
		
		if (arrList.size()==0) {
			System.out.println("0");
			return;
		}
		
		Collections.sort(arrList);
		
		for (Integer integer : arrList) {
			System.out.print(-integer+" "+integer+" ");
		}
		System.out.print("\n");
		

	}
}
