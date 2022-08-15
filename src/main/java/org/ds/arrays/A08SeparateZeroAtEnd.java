package org.ds.arrays;

// Push all the zero at end
public class A08SeparateZeroAtEnd {
	public static void main(String[] args) {

		int arr[] = { 2, 0, 4, 1, 0, -3, 0, 8 };
		separateZeroAtEnd(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void separateZeroAtEnd(int arr[]) {
		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
	}

}
