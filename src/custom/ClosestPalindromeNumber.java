package custom;

import java.util.Scanner;

public class ClosestPalindromeNumber {

	
	public static void main(String[] args) {
		//String value = "1234";
		//String value = "123456";
		//String pal_value = new ClosestPalindromeNumber().nearestPalindromic(value);
		//System.out.println(pal_value);
		
		
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		for (int i = 0; i < t; i++) {
			int value = kb.nextInt();
			System.out.println(nearestPalindromic(String.valueOf(value)));
		}
		
	}
	
	
	
	
	    public static String mirroring(String s) {
	        String x = s.substring(0, (s.length()) / 2);
	        return x + (s.length() % 2 == 1 ? s.charAt(s.length() / 2) : "") + new StringBuilder(x).reverse().toString();
	    }
	    public static String nearestPalindromic(String n) {
	        if (n.equals("1"))
	            return "0";

	        String a = mirroring(n);
	        long diff1 = Long.MAX_VALUE;
	        diff1 = Math.abs(Long.parseLong(n) - Long.parseLong(a));
	        if (diff1 == 0)
	            diff1 = Long.MAX_VALUE;

	        StringBuilder s = new StringBuilder(n);
	        int i = (s.length() - 1) / 2;
	        while (i >= 0 && s.charAt(i) == '0') {
	            s.replace(i, i + 1, "9");
	            i--;
	        }
	        if (i == 0 && s.charAt(i) == '1') {
	            s.delete(0, 1);
	            int mid = (s.length() - 1) / 2;
	            s.replace(mid, mid + 1, "9");
	        } else
	            s.replace(i, i + 1, "" + (char)(s.charAt(i) - 1));
	        String b = mirroring(s.toString());
	        long diff2 = Math.abs(Long.parseLong(n) - Long.parseLong(b));


	        s = new StringBuilder(n);
	        i = (s.length() - 1) / 2;
	        while (i >= 0 && s.charAt(i) == '9') {
	            s.replace(i, i + 1, "0");
	            i--;
	        }
	        if (i < 0) {
	            s.insert(0, "1");
	        } else
	            s.replace(i, i + 1, "" + (char)(s.charAt(i) + 1));
	        String c = mirroring(s.toString());
	        long diff3 = Math.abs(Long.parseLong(n) - Long.parseLong(c));

	        if (diff2 <= diff1 && diff2 <= diff3)
	            return b;
	        if (diff1 <= diff3 && diff1 <= diff2)
	            return a;
	        else
	            return c;
	    }
	
}
