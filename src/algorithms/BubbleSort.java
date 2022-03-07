package algorithms;

import common.*;

public class BubbleSort {
	public static <T> void sort(List<T> list, Comparator<T> cmp) {
		for (int i = 1; i < list.length(); i++) {
			boolean swapped = false;
			for (int j = 1; j < list.length(); j++) {
				if (cmp.compare(list.getItem(j - 1), list.getItem(j)) > 0) {
					list.swap(j, j - 1);
					swapped = true;
				}
			}
			if (!swapped) break;
		}
	}
}
