package array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateinArray {
	public static void main(String[] args) {
		//[3 4 1 4 1]
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(4);
		list.add(1);
		list.add(3);
		
		
		System.out.println(repeatedNumber(list));
	}

		public static int repeatedNumber(final List<Integer> a) {
			
			
			
			for (int i = 0; i < a.size(); i++) {
				int value = a.indexOf(a.get(i));
				if (value<i) {
					return a.get(i);
				}
				/*if (a.get(Math.abs(a.get(i)))>=0) {
					a.set(Math.abs(a.get(i)), -a.get(Math.abs(a.get(i))));
				}else {
					//System.out.println(Math.abs(a.get(i)));
					return Math.abs(a.get(i));
				}*/
				
			}
			return -1;
	    
		}
}
