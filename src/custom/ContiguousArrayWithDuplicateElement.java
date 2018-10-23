package custom;

import java.util.HashSet;

public class ContiguousArrayWithDuplicateElement {

	
	public static void main(String[] args){
		ContiguousArrayWithDuplicateElement obj = new ContiguousArrayWithDuplicateElement();
		int[] arr = {5,2,3,6,4,4,6,6};
		
		obj.check(arr);
	}

	private void check(int[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
				hs.add(arr[i]);
				
		}
		
		for (Integer integer : hs) {
			System.out.println(""+integer);
			
		}
	}
}
