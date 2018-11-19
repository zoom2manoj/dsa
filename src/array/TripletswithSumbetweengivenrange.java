package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TripletswithSumbetweengivenrange {

	public static void main(String[] args) {

		String[] arr = { "0.6", "0.7", "0.8", "1.2", "0.4" };
		solve(arr);
	}

	public static int solve(String[] A) {

		Set<Double> set = new TreeSet<Double>();
		for (String num : A) {
			set.add(Double.parseDouble(num));
		}
		double lowerRange = 0.67;

		// Getting the three ranges
		List<Double> lowerRangeList = new ArrayList<Double>();
		for (Double d : set) {
			if (d < lowerRange) {
				lowerRangeList.add(d);
			}
		}

		List<Double> middleRangeList = new ArrayList<Double>();
		for (Double d : set) {
			if (d >= lowerRange && d <= 1) {
				middleRangeList.add(d);
			}
		}

		List<Double> upperRangeList = new ArrayList<Double>();
		for (Double d : set) {
			if (d > 1 && d < 2) {
				upperRangeList.add(d);
			}
		}

		// Checking for a possible triplet
		double sum;
		int lowerSetSize = lowerRangeList.size();
		int middleSetSize = middleRangeList.size();
		int upperSetSize = upperRangeList.size();

		// Case 1
		if (lowerSetSize >= 3) {
			sum = lowerRangeList.get(lowerSetSize - 1)
					+ lowerRangeList.get(lowerSetSize - 2)
					+ lowerRangeList.get(lowerSetSize - 3);
			if (sum > 1 && sum < 2) {
				return 1;
			}
		}

		// Case 2
		if (upperSetSize > 0 && lowerSetSize >= 2) {
			sum = upperRangeList.get(0) + lowerRangeList.get(0)
					+ lowerRangeList.get(1);
			if (sum > 1 && sum < 2) {
				return 1;
			}
		}

		// Case 3
		if (lowerSetSize > 0 && middleSetSize > 0 && upperSetSize > 0) {
			sum = lowerRangeList.get(0) + middleRangeList.get(0)
					+ upperRangeList.get(0);
			if (sum > 1 && sum < 2) {
				return 1;
			}
		}

		// Case 4
		if (lowerSetSize > 0 && middleSetSize > 1) {
			sum = lowerRangeList.get(0) + middleRangeList.get(0)
					+ middleRangeList.get(1);
			if (sum > 1 && sum < 2) {
				return 1;
			}
		}

		// Case 5
		if (lowerSetSize > 1 && middleSetSize > 0) {
			sum = lowerRangeList.get(lowerSetSize - 1)
					+ lowerRangeList.get(lowerSetSize - 2)
					+ middleRangeList.get(middleSetSize - 1);
			if (sum > 1 && sum < 2) {
				return 1;
			}
		}

		// Case 6
		List<Double> lowerFirst = new ArrayList<Double>();
		List<Double> lowerSec = new ArrayList<Double>();

		for (Double d : lowerRangeList) {
			if (d < 0.5) {
				lowerFirst.add(d);
			} else {
				lowerSec.add(d);
			}
		}

		if (!lowerFirst.isEmpty() && !lowerSec.isEmpty()
				&& !middleRangeList.isEmpty()) {
			sum = lowerFirst.get(0) + lowerSec.get(0) + middleRangeList.get(0);
			if (sum > 1 && sum < 2) {
				return 1;
			}
		}

		if (lowerSec.size() > 1 && !middleRangeList.isEmpty()) {
			sum = lowerSec.get(0) + lowerSec.get(1) + middleRangeList.get(0);
			if (sum > 1 && sum < 2) {
				return 1;
			}
		}

		if (!lowerFirst.isEmpty() && !lowerSec.isEmpty()
				&& !middleRangeList.isEmpty()) {
			sum = lowerFirst.get(lowerFirst.size() - 1)
					+ lowerSec.get(lowerSec.size() - 1)
					+ middleRangeList.get(middleSetSize - 1);
			if (sum > 1 && sum < 2) {
				return 1;
			}
		}

		return 0;
	}

}
