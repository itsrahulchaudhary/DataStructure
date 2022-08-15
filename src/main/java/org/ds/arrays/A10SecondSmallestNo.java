package org.ds.arrays;

public class A10SecondSmallestNo {
	
	public static void main(String[] args) {
		int arr[] = { 7, 3, 9, 1, 5, 6 };
		secondSmallest(arr);
	}

	public static void secondSmallest(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second Smallest " + arr[1]);
	}
}
