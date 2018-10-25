package custom;

import java.util.Scanner;

public class PrimeNumberOfSetBits {

	public static void main(String[] args) {
		//int x = 10;
		//int y = 15;

		//primeNumberSet(x, y);
		
		Scanner kb = new Scanner(System.in);
	    int t = kb.nextInt();
	    for (int i = 0; i < t; i++) {
			int x= kb.nextInt();
			int y= kb.nextInt();
			
			primeNumberSet(x, y);
			
		}
	    

	}

	private static void primeNumberSet(int x, int y) {
		// TODO Auto-generated method stub
		int primeCount = 0;
		for (int i = x; i <= y; i++) {

			int setCount = convertBinary(i);
			//System.out.println(setCount + " ");

			if (setCount > 1) {
				if (isPrime(setCount))
					primeCount++;
			}

			

		}
		
		System.out.println("" + primeCount);
	}

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) {
				// number is perfectly divisible - no prime
				return false;
			}
		}
		return true;
	}

	private static int convertBinary(int i) {
		// TODO Auto-generated method stub

		int count = 0;
		while (i != 0) {
			int reminder = i % 2;
			if (reminder == 1) {
				count++;
			}
			i = i / 2;
		}
		return count;
	}
}
