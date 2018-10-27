package custom;

import java.util.ArrayList;
import java.util.Scanner;

public class FindKthCharInString {

	public static void main(String[] args) {
		
		int m = 5;
		int k = 5;
		int n =3;
		// 1
		
		
		//int m = 11;
		//int k = 6;
		//int n =4;
		//1
		
		
		
		//getKthChar(m, k, n);

 		getKthString(m, k, n);
		
		
		/*Scanner kb = new Scanner(System.in);
	    int t = kb.nextInt();
	    for (int i = 0; i < t; i++) {
			int m= kb.nextInt();
			int k= kb.nextInt();
			int n= kb.nextInt();
			
			getKthChar(m, k, n);
			
		}*/
	}

	private static void getKthString(int m, int k, int n) {
		// TODO Auto-generated method stub
		
		int division = (int) Math.pow(2, n);
		int block = k/division;
		int reminder  = k%division;
		
		int s[] = new int[32]; 
	    int x = 0; 
	  
	    // binary representation of M 
	    for (; m > 0; x++) 
	    { 
	        s[x] = m % 2; 
	        m = m / 2; 
	    } 
	    
	    
	    int root = s[x - 1 - block];
	    if (reminder == 0)  
	    { 
	        System.out.println(root); 
	        return; 
	    } 
	    
	    Boolean flip = true; 
	    while (reminder > 1)  
	    { 
	        if ((reminder & 1) > 0) 
	        { 
	            flip = !flip; 
	        } 
	        reminder = reminder >> 1; 
	    } 
	  
	    if (flip) 
	    { 
	    	//myBoolean ? 1 : 0
	        System.out.println((!(root > 0))?1:0); 
	    } 
	    else 
	    { 
	        System.out.println(root); 
	    } 
		
	}

	

}
