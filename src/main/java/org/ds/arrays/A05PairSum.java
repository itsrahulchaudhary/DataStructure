package org.ds.arrays;
// find pair sum of two number
public class A05PairSum {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 1, 6, 4 };
		int sum = 6;
		//pairSum(arr, sum);
		pairSum2pointer(arr,sum);

	}

	// brute-force
	public static void pairSum(int arr[], int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}

	// 2 pointer approach
	public static void pairSum2pointer(int arr[], int sum) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] > sum) {
				j--;
			} else if (arr[i] + arr[j] < sum) {
				i++;
			} else {
				System.out.println(arr[i] + " " + arr[j]);
				i++;
				j--;
			}
		}
	}

}
