package custom;

import java.util.ArrayList;
import java.util.Scanner;

public class FindKthCharInString {

	public static void main(String[] args) {
		
		//int m = 5;
		//int k = 5;
		//int n =3;
		// 1
		
		
		//int m = 11;
		//int k = 6;
		//int n =4;
		//1
		
		
		
		
		//getKthChar(m, k, n);
		
		
		Scanner kb = new Scanner(System.in);
	    int t = kb.nextInt();
	    for (int i = 0; i < t; i++) {
			int m= kb.nextInt();
			int k= kb.nextInt();
			int n= kb.nextInt();
			
			getKthChar(m, k, n);
			
		}
	}

	private static void getKthChar(int m, int k, int n) {
		// TODO Auto-generated method stub
		
		String bin = convertBinary(m);
		String iteratedBinary = iterationOverbinary(bin, n);
		//System.out.println(iteratedBinary);
		System.out.println(iteratedBinary.charAt(k));
		
		
	}

	private static String iterationOverbinary(String bin, int n) {
		// TODO Auto-generated method stub
		char[] cArr = bin.toCharArray();
		
		
		for (int i = 0; i < n; i++) {
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < cArr.length; j++) {
				if (cArr[j]=='0') {
					sb.append("01");
				}else {
					sb.append("10");
				}
			}
			cArr = sb.toString().toCharArray();

			System.out.println(sb.toString()+"\n");
			System.out.println("");
		}
		
		return new String(cArr);
	}

	private static String convertBinary(int i) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer();
		
		while (i != 0) {
			int reminder = i % 2;
				
				sb.append(String.valueOf(reminder));
		
		
			i = i / 2;
		}
		//System.out.println(sb.toString());
		return sb.toString();
	}
}
