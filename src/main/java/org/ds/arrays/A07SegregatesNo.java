package org.ds.arrays;

// Segregate number like
// input  { 2, -1, 4, -8, 3, 5, -9 }
// output { -1,-8,-9, 2, 3, 5, 4 }
public class A07SegregatesNo {

	public static void main(String[] args) {
		int arr[] = { 2, -1, 4, -8, 3, 5, -9 };
		segregates(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void segregates(int arr[]) {
		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
	}

}
