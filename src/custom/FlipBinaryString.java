package custom;

public class FlipBinaryString {
	
	
	
	/*S = 010

Pair of [L, R] | Final string
_______________|_____________
[1 1]          | 110
[1 2]          | 100
[1 3]          | 101
[2 2]          | 000
[2 3]          | 001

We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].*/
	
	
	
	public static void main(String[] args) {

		String S = "010";
		//System.out.println(flip(S));
		System.out.println(flip2(S));
	}

	private static int[] flip2(String A) {
		// TODO Auto-generated method stub
		
		
		int start=0, end =0, sum=0, finalsum=0;
		
		char[] cArr = A.toCharArray();
		int[] arr= null;
		
		for (int i = 0; i < A.length(); i++) {
		
			if (cArr[i]=='0') {
				sum+=1;
			}else {
				sum-=1;
			}
			
			if (sum<0) {
				sum =0;
				start = i+1;
			}
			
			
			if (sum>finalsum) {
				finalsum = sum;
				arr = new int[2];
				arr[0] = start;
				arr[1]= end = i;
			}
			
			
		}
		
		
		 if (arr!=null) {
		    	arr[0] = arr[0] + 1;
		    	arr[1] = arr[1] + 1;
		        
		    } 
		 
		if (arr==null) {
			return new int[0];
		}else {
			return arr;	
		}
		
		
		
	}

	

}
