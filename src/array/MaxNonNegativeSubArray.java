package array;

public class MaxNonNegativeSubArray {

	public static void main(String[] args) {
		
//		int arr[] = {1, 2, 5, -7, 2,  3, 5, 6};
		int arr[] = {-1, -1, -1, -2};
		max(arr);
		
		
	}

	private static  int[] max(int[] A) {
        int len=A.length;
        long max_ans=-1, curr_sum=0;
        int start=0, end=0;
        int s=0, e=0;
        int val;
        for(int i=0;i<len;i++) {
            val=A[i];
            //If values is negative, reset sum to 0 and continue to next val
            if(val<0) {
                s=i+1;
                curr_sum=0;
                continue;
            }
            //For non-negative values, keep adding to sum
            curr_sum+=val;
            e=i;
            //Update global max according to given problem NOTE
            if(max_ans<curr_sum) {
                max_ans=curr_sum;
                start=s; end=e;
            }else if(max_ans == curr_sum && end-start < e-s) {
                start=s; end=e;
            }
        }
        //Return the values in range
        if(max_ans != -1) {
            int ans[] = new int[end-start+1];
            int j=0;
            for(int i=start;i<=end;){
                ans[j++] = A[i++];
            }
            return ans;
        }
        return new int[0];
    }
}
