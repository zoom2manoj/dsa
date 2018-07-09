package sorting;

public class SelectionSort {

	
	public static void sort(String[] a) {
		  for (int i=0; i<a.length-1; i++) {
		     for (int j=i+1; j<a.length; j++) {
		        if (a[i].compareTo(a[j]) > 0) {
		           String temp=a[j]; a[j]=a[i]; a[i]=temp;
		        }
		     }
		  }
		}
	
	
	
	public static void main(String[] args) {
		String[] a = {"za","zb", "zc", "ac", "d", "a", "e"};
		sort(a);
		System.out.println(a);
		printAray(a);
	}



	private static void printAray(String[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
	}
}
