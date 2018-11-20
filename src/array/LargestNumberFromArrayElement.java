package array;
import java.util.*;


public class LargestNumberFromArrayElement {

	public static void main(String[] args) {

		int[] arr = {3, 30, 34, 5, 9};
		System.out.println(largestNumber(arr));
	}

	public static String largestNumber(final int[] A) {
		
		//Integer[] sorted = ArrayUtils.toObject(data);
		Integer[] AObject = Arrays.stream( A ).boxed().toArray( Integer[]::new );

		Arrays.sort(AObject,  new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				String XY = String.valueOf(o1)+String.valueOf(o2);
				String YX = String.valueOf(o2)+String.valueOf(o1);

				return XY.compareTo(YX)> 0?-1:1;
			}
		});
		
	
		
		
		
		  StringBuilder sb = new  StringBuilder();
	    for (int i = 0; i < AObject.length; i++) {
			
		
	    	String s = String.valueOf( AObject[i]);
	        sb.append(s);
	    }
	    String tem = sb.toString();
	    tem = tem.replaceAll("0", "");
	    
	    if (tem.length()==0) {
			return "0";
		}
		return sb.toString();
		
	}

}
