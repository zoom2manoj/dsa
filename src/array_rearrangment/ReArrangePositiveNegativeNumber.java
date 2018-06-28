package array_rearrangment;

public class ReArrangePositiveNegativeNumber {

	
	public static void main(String[] args) {
		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		
        int n = arr.length;
        rearrange(arr,n);
        System.out.println("Array after rearranging: ");
        printArray(arr,n);
	}
	
	
	 // The main function that rearranges elements of given
    // array.  It puts positive elements at even indexes (0,
    // 2, ..) and negative numbers at odd indexes (1, 3, ..).
    static void rearrange(int arr[], int n)
    {
       int i =-1;
       for (int j = 0; j < arr.length; j++) {
		
    	   if (arr[j]<0) {
    		   i++;
    		   int temp = arr[i];
    		   arr[i] = arr[j];
    		   arr[j] = temp;
		}  
	}
       
       int pos  = i+1;
       int start = 0;
	   printArray(arr, n);

       while (pos<n && start<pos && arr[start]<0) {
		
    	   int temp = arr[start];
    	   arr[start] = arr[pos];
    	   arr[pos] = temp;
    	   start+=2;
    	   pos++;
    	   printArray(arr, n);
	}
       
    }
 
    // A utility function to print an array
    static void printArray(int arr[], int n)
    {
    	System.out.println("");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
    }
}
