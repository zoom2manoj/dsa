package array;

public class MaximumUnsortedSubarray {
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 4, 5};
		subUnsort(arr);
	}
	
	
	public static int[] subUnsort(int[] A) {
		int n = A.length;
		int s = 0, e = n-1, i, max, min;    
        
	      for (s = 0; s < n-1; s++) 
	      { 
	        if (A[s] > A[s+1]) 
	          break; 
	      } 
	      if (s == n-1) 
	      { 
	        //System.out.println("The complete array is sorted"); 
	        int[] temp = {-1};
	        return temp; 
	      } 
	        
	      for(e = n - 1; e > 0; e--) 
	      { 
	        if(A[e] < A[e-1]) 
	          break; 
	      } 
	        
	      max = A[s]; min = A[s]; 
	      for(i = s + 1; i <= e; i++) 
	      { 
	        if(A[i] > max) 
	          max = A[i]; 
	        if(A[i] < min) 
	          min = A[i]; 
	      } 
	        
	      for( i = 0; i < s; i++) 
	      { 
	        if(A[i] > min) 
	        {   
	          s = i; 
	          break; 
	        }       
	      }  
	        
	      for( i = n -1; i >= e+1; i--) 
	      { 
	        if(A[i] < max) 
	        { 
	          e = i; 
	          break; 
	        }  
	      }   
	            
	     /* System.out.println(" The unsorted subarray which"+ 
	                         " makes the given array sorted lies"+ 
	                       "  between the indices "+s+" and "+e); 
	     */ int[] temp = {s, e};
	        return temp;
	      
		
    }
}
