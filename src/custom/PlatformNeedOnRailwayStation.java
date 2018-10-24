package custom;

import java.util.Arrays;
import java.util.Scanner;

public class PlatformNeedOnRailwayStation {

	
	public static void main(String[] args) {
		//int arr[] = {900, 940, 950, 1100, 1500, 1800}; 
	    //int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; 
	    //3
	    
	    //int arr[] = {149}; 
	    //int dep[] = {1300};
	    //1
	    
	    
	    

	    int arr[] = {6, 552, 244, 936, 151, 1604, 1110, 301, 1448, 529, 1125, 930, 236, 1651, 640, 1712, 1042, 305, 1032, 222, 756, 1722, 1954, 503, 1515, 1422, 1632, 727, 1626, 1635, 137, 341, 601, 1, 1439, 401, 1756, 126, 1126, 1613, 9, 1717, 820, 19, 149, 928, 1525, 1031, 704, 102, 1, 1237, 333, 430, 1242, 546, 1433, 305, 1505, 553, 553, 1129, 1638, 1528, 534, 1800, 1950, 538, 1705, 732, 821, 256, 838, 1717, 247, 35, 132, 1730, 1522};
	    int dep[] = {1448, 1200 ,700 ,1600 ,1818 ,1608 ,1128 ,1523 ,1539 ,543 ,1141 ,1158 ,244 ,2037 ,1958 ,1734 ,1054 ,838 ,1040 ,900 ,1928 ,1755 ,2027 ,2026 ,1552 ,1609 ,1633 ,800 ,1639 ,1652 ,1100 ,2309 ,614 ,1611 ,1518 ,1331 ,2235 ,1705 ,1130 ,1620 ,200 ,2000 ,855 ,600 ,854 ,930 ,1639 ,1053 ,2158 ,1317 ,1727 ,2053 ,900 ,528 ,1254 ,555 ,1454 ,2300 ,1509 ,1700 ,1800 ,1834 ,1709 ,1557 ,1924 ,1831 ,1956 ,557 ,1705 ,951 ,2300 ,2138 ,1334 ,1746 ,1900 ,245 ,1700 ,2101 ,2359};

	    
	    
	    int n = arr.length; 
	    System.out.println("Minimum Number of Platforms Required = " + PlatfindPlatform(arr, dep, n));
	    
	    /*Scanner kb = new Scanner(System.in);
	    int t = kb.nextInt();
	    for (int i = 0; i < t; i++) {
			int size = kb.nextInt();
			int[] arr = new int[size];
			int[] dep = new int[size];
			
			for (int j = 0; j < size; j++) {
				arr[j] = kb.nextInt();			
			}
			
			for (int j = 0; j < size; j++) {
				dep[j] = kb.nextInt();			
			}
			System.out.println(""+PlatfindPlatform(arr, dep, size));
			
		}*/
	    
	}

	private static int  PlatfindPlatform(int[] arr, int[] dep, int n) {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int result = 0;
		int needPlatform =0;
		int i=0;
		int j=0;
		
		while (i<n&& j<n) {
			
			if (arr[i]<=dep[j]) {
				needPlatform++;
				if (needPlatform>result) {
					result = needPlatform;
				}
				i++;
			}else {
				needPlatform--;
				j++;
			}
			
			
		}
		
		
		
		return result;
	}
}
