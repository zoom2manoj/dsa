package custom;

public class FindSmallestRangeElementsFromKLists {

	// this solution will modify with heap sorting concept.
	public static void main(String[] args) {
		FindSmallestRangeElementsFromKLists obj = new FindSmallestRangeElementsFromKLists();
		int k = 3;
		int arr[][] = {
				{  3, 10, 15, 24  },
				{  0, 1, 2, 20 },
				{ 1, 18, 21, 30} 
				};
		
		

		obj.findSmallestRangeElements(arr, k);
	}

	private void findSmallestRangeElements(int[][] arr, int k) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int difference = Integer.MAX_VALUE;
		int i = 0;
		int[] pointer = new int[k];
		for (int j = 0; j < pointer.length; j++) {
			pointer[j]=0;
		}

		for (int j = 0; j < arr[i].length; j++) {
			int tempmin = Integer.MAX_VALUE;
			int tempmax = Integer.MIN_VALUE;
			int minIndex=0;
			int minIndexValue=0;
			while (i < k) {
				int value = arr[i][pointer[i]];
				if (tempmin > value) {
					tempmin = value;
					minIndex = i;
					minIndexValue  = pointer[i]+i;
					
				}
				
				if(tempmax < value) {
					tempmax = value;
				}
				
				i++;
			}
			pointer[minIndex] = minIndexValue;
			i = 0;
			
			if (difference>(tempmax-tempmin)) {
				difference = tempmax-tempmin;
				min = tempmin;
				max = tempmax;
			}
		}

		
		System.out.println("Smallest Range is: "+( max-min)+" from : "+min +" to "+max);
		

	}

}
