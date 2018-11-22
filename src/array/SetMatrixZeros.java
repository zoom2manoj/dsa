package array;

import java.util.ArrayList;

public class SetMatrixZeros {
	public static void main(String[] args) {
		int[][] A = { { 1, 0, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<Integer> item1 = new ArrayList<>();
		item1.add(1);
		item1.add(0);
		item1.add(1);

		ArrayList<Integer> item2 = new ArrayList<>();
		item2.add(1);
		item2.add(1);
		item2.add(1);

		ArrayList<Integer> item3 = new ArrayList<>();
		item3.add(1);
		item3.add(1);
		item3.add(1);

		list.add(item1);
		list.add(item2);
		list.add(item3);

		setZeroes(list);

	}

	public static void setZeroes(ArrayList<ArrayList<Integer>> a) {

		boolean row_flag = false;
		boolean col_flag = false;

		for (int i = 0; i < a.size(); i++) {
			ArrayList<Integer> item = a.get(i);
			for (int j = 0; j < item.size(); j++) {

				if (i == 0 && item.get(j) == 0)
					row_flag = true;

				if (j == 0 && item.get(j) == 0)
					col_flag = true;

				if (item.get(j) == 0) {

					ArrayList<Integer> temp = a.get(0);

					temp.set(j, 0);

					item.set(0, 0);
					a.set(0, temp);
					a.set(i, item);
				}

			}
		}

		for (int i = 1; i < a.size(); i++) {
			ArrayList<Integer> item = a.get(0);

			for (int j = 1; j < item.size(); j++) {
				ArrayList<Integer> temp = a.get(i);

				if (item.get(j) == 0 || temp.get(0) == 0) {
					temp.set(j, 0);
					a.set(i, temp);

				}
			}
		}

		if (row_flag == true) {
			ArrayList<Integer> temp = a.get(0);

			for (int i = 0; i < temp.size(); i++) {
				temp.set(i, 0);
				a.set(0, temp);

			}
		}

		// modify first col if there was any 1
		if (col_flag == true) {

			for (int i = 0; i < a.size(); i++) {
				ArrayList<Integer> item = a.get(i);
				item.set(0, 0);
				a.set(i, item);

			}
		}

		printMatrix(a);
	}

	public static void printMatrix(ArrayList<ArrayList<Integer>> a) {
		for (int i = 0; i < a.size(); i++) {
			ArrayList<Integer> item = a.get(i);
			System.out.print("[");
			for (int j = 0; j < item.size(); j++) {
				System.out.print(item.get(j)+" ");
			}
			System.out.print("] ");
		
		}
	}

}
