package custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class MaximumTipCalculator {

	
	//5 3 3
	//1 2 3 4 5
	//5 4 3 2 1
	
	public static void main(String[] args) {

		MaximumTipCalculator obj = new MaximumTipCalculator();
		obj.maxTipCal();

	}

	private void maxTipCal() {
		// TODO Auto-generated method stub

		int N = 5;
		int X = 3;
		int Y = 3;
		int total_tips = 0;

		List<Set> set_vector = new ArrayList<MaximumTipCalculator.Set>();
		int[] A = { 1, 2, 3, 4, 5 };
		int[] B = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < A.length; i++) {
			set_vector.add(new Set(A[i]));

		}

		for (int i = 0; i < B.length; i++) {
			Set set = set_vector.get(i);
			set.b = B[i];
			set.diff = set.a - B[i];
			set_vector.set(i, set);

		}

		// now sorting over vector with diff consideration
		for (int i = 0; i < set_vector.size(); i++) {
			Set set = set_vector.get(i);
			System.out.println("A: " + set.a);
			System.out.println("B: " + set.b);
			System.out.println("diff: " + set.diff);
		}
		System.out.println("=============");

		Collections.sort(set_vector, new Comparator<Set>() {

			public int compare(Set o1, Set o2) {
				// TODO Auto-generated method stub

				if (Math.abs(o1.diff) > Math.abs(o2.diff)) {
					return -1;
				} else {
					return 1;
				}

			}
		});

		for (int i = 0; i < set_vector.size(); i++) {
			Set set = set_vector.get(i);
			System.out.println("A: " + set.a);
			System.out.println("B: " + set.b);
			System.out.println("diff: " + set.diff);
		}

		int curr = 0;

		while (X > 0 && Y > 0 && curr < N) {
			if (set_vector.get(curr).diff > 0) {
				total_tips += set_vector.get(curr).a;
				--X;

			} else {
				total_tips += set_vector.get(curr).b;
				--Y;

			}
			++curr;
		}

		while (X > 0 && curr < N) {
			total_tips += set_vector.get(curr).a;

			--X;
			++curr;

		}

		while (Y > 0 && curr < N) {
			total_tips += set_vector.get(curr).b;
			--Y;
			++curr;
		}

		System.out.println("Total Tips : " + total_tips);

	}

	class Set {
		int a, b, diff;

		public Set(int a) {
			// TODO Auto-generated constructor stub
			this.a = a;
			this.b = this.diff = 0;
		}
	}
}
