package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import array.InsertIntervalWithMerge.Interval;

public class MergeIntervals {

	/*
	 * Given a collection of intervals, merge all overlapping intervals.
	 * 
	 * For example, Given [1,3],[2,6],[8,10],[15,18], return [1,6],[8,10],[15,18].
	 */

	public static class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public static void main(String[] args) {
		ArrayList<MergeIntervals.Interval> intervals = new ArrayList<MergeIntervals.Interval>();
		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(2, 5));
		intervals.add(new Interval(6, 7));
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(12, 16));

		merge(intervals);
	}

	private static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		// TODO Auto-generated method stub
		ArrayList<Interval> results = new ArrayList<MergeIntervals.Interval>();

		if (intervals == null || intervals.size() == 0)
			return results;

		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval i1, Interval i2) {
				if (i1.start != i2.start)
					return i1.start - i2.start;
				else
					return i1.end - i2.end;
			}
		});

		Interval pre = intervals.get(0);
		for (int i = 0; i < intervals.size(); i++) {
			Interval curr = intervals.get(i);
			if (curr.start > pre.end) {
				results.add(pre);
				pre = curr;
			} else {
				Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
				pre = merged;
			}
		}
		results.add(pre);
		return results;
	}
}
