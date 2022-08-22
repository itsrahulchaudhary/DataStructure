package org.ds.arrays;
// find the index
public class C01LinearSearch {
	public static void main(String[] args) {
		int arr[] = { 10, 30, 23, 50, 90, 55 };
		int target = 23;
		System.out.print(linearSearch(arr, target));

	}

	public static int linearSearch(int arr[], int target) {

		if (arr.length == 0)
			return -1;

		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}

		return -1;

	}

}
