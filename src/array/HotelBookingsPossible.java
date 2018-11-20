package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HotelBookingsPossible {

	public static void main(String[] args) {
		
		//Arrivals :   [1 3 5]
		//Departures : [2 6 8];
		//A : [ 1, 2, 3, 4 ]
		//B : [ 10, 2, 6, 14 ]
			//	C : 4
		ArrayList<Integer> arrival = new ArrayList<>();
		/*arrival.add(1);
		arrival.add(3);
		arrival.add(4);
		*/
		
		arrival.add(1);
		arrival.add(2);
		arrival.add(3);
		//arrival.add(4);
		
		ArrayList<Integer> depart = new ArrayList<>();
		/*depart.add(12);
		depart.add(6);
		depart.add(8);*/
		
		depart.add(2);
		depart.add(3);
		depart.add(4);
		//depart.add(14);
		
		System.out.println(hotel(arrival, depart, 1)+"");
		  
		
	}
	
	
	public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
		// TODO Auto-generated method stub
		
		
		
		Collections.sort(arrive);
		Collections.sort(depart);
		
		int booking =0;
		int i=0;
		int j=0;
		
	
		
		while (i<arrive.size()&& j<depart.size()) {
			if (arrive.get(i)<depart.get(j)) {
				
				if (booking<K) {
					booking++;
				}else {
					return false;
				}
				i++;
			}else {
				booking--;
				j++;
			}
		}
		
		
		
		return true;
	}
}
