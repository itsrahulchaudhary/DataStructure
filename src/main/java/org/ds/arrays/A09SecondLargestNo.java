package org.ds.arrays;
// find second largest element
public class A09SecondLargestNo {
	public static void main(String[] args) {
		int arr[] = { 7, 3, 9, 1, 5, 6 };
		secondLargest(arr);
	}

	public static void secondLargest(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second Largest " + arr[1]);
	}

}
