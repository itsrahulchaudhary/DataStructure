package org.ds.arrays;

public class B02BSOrderAgnostic {

	public static void main(String[] args) {

	}

	public static int binarySearch(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		// find the array is sorted order ascending , descending
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}
		return -1;
	}

}
