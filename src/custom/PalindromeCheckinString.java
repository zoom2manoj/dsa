package custom;

import java.util.Scanner;

public class PalindromeCheckinString {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		
		for (int i = 0; i < t; i++) {
			//String value = kb.next();
			isPalindrome(kb.nextLine());
		}
		
		
	}

	private static void isPalindrome(String value) {
		char[] stringChar = value.toLowerCase().toCharArray();
		int startPoint = 0;
		int entPoint = stringChar.length - 1;
		boolean flage = false;
		while (startPoint < entPoint) {

			if (!isLetterOrDigit(stringChar[startPoint])) {
				startPoint++;
				continue;
			}

			if (!isLetterOrDigit(stringChar[entPoint])) {
				entPoint--;
				continue;
			}
			
			if (stringChar[startPoint]==stringChar[entPoint]) {
				startPoint++;
				entPoint--;
			}else {
				flage = true;
				break;
			}
		}
	
		if (flage) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

	private static boolean isLetterOrDigit(char c) {
		// TODO Auto-generated method stub
		return Character.isLetter(c) || Character.isDigit(c);
	}
}
