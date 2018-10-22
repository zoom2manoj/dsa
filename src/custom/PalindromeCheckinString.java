package custom;

public class PalindromeCheckinString {

	public static void main(String[] args) {
		PalindromeCheckinString obj = new PalindromeCheckinString();

		//Consider alphabets and numbers only for palindrome check. Ignore symbols and whitespaces.
		
		String value = "Ab?/Ba";
		String valuw1 = "I am :IronnorI Ma, i";
		
//		String value = "madam1";

		
		obj.isPalindrome(valuw1);
	}

	private void isPalindrome(String value) {
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

	private boolean isLetterOrDigit(char c) {
		// TODO Auto-generated method stub
		return Character.isLetter(c) || Character.isDigit(c);
	}
}
