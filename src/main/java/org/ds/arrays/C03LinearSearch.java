package org.ds.arrays;

// search in range
public class C03LinearSearch {

	public static void main(String[] args) {
		int arr[] = { 10, 30, 23, 50, 90, 55 };
		int target = 50;
		int searchInRange = searchInRange(arr, target, 1, 3);
		System.out.println(searchInRange);
	}

	public static int searchInRange(int arr[], int target, int start, int end) {
		if (arr.length == 0)
			return -1;

		for (int i = start; i <= end; i++) {
			if (arr[i] == target)
				return i;
		}

		return -1;
	}
}
