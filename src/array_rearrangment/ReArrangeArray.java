package array_rearrangment;

public class ReArrangeArray {
	
	public static void main(String[] args) {
		int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4,-1};
		ReArrangeArray reArrangeArray = new ReArrangeArray();
		reArrangeArray.arrange(arr);
		reArrangeArray.printArray(arr);
		
	}

	private void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private void arrange(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=-1 && arr[i]!=i) {
				
				int x = arr[i];
				
				while (arr[x]!=-1&&arr[x]!=x) {
					
					int y = arr[x];					
					arr[x] = x;
					x = y;					
				}
				
				arr[x] = x;
				
				if (arr[i]!=i) {
					arr[i]  = -1;
				}
				
				
			}
		}

	}

}
