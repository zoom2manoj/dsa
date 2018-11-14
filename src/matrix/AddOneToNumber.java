package matrix;

import java.math.BigInteger;

public class AddOneToNumber {
	public static void main(String[] args) {
		//int[] A = { 1, 1, 1, 3, 2, 1, 1, 2, 5, 9, 6, 5 };
		//int[] A = { 1, 2,3 };
		int[] A = { 0 };
		int b[] = plusOne(A);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	public static int[] plusOne(int[] A) {
		
		StringBuffer d = new StringBuffer();
		for (int i = 0; i < A.length; i++) {
			d.append(A[i]);
		}
		System.out.println(d);
		
		BigInteger bbb = new BigInteger(d.toString());
		BigInteger bi2 = new BigInteger("1");
		BigInteger b2 = bbb.add(bi2);
		
		String temp = b2.toString();
		System.out.println(temp);
		int[] newGuess = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			newGuess[i] = temp.charAt(i) - '0';
		}
		return newGuess;
	}
}
