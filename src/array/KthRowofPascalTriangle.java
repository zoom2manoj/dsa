package array;

public class KthRowofPascalTriangle {
	 public static void main(String args[]) {
	        
	        
	        int aa[] = getRow(3);
	        for(int i :aa){
	            System.out.print(i+" ");
	        }
	    }
	    
	     public static int[] getRow(int A) {
	        
	        
	        
	       
	        int[][] arr = new int[A+1][];
	 int[] temp = new int[0];
	        for (int i = 0; i < A+1; i++) {

	            if (i == 0) {
	                int[] temp1 = { 1 };
	                arr[i] = temp1;
	            } else {
	                 temp = new int[i + 1];
	                int[] gt = arr[i - 1];
	                for (int j = 0; j < temp.length; j++) {
	                    if (j == 0) {
	                        temp[j] = gt[j];
	                    } else if (j == temp.length - 1) {
	                        temp[j] = gt[j - 1];
	                    } else {
	                        temp[j] = gt[j] + gt[j - 1];
	                    }

	                }
	                arr[i] = temp;
	            }

	        }

	        return arr[A];
	    
	    }
}
