package org.ds.arrays;

import java.util.Arrays;

public class C06SearchIn2DArray {
	public static void main(String[] args) {
		int arr[][] = { 
				{ 2, 5, 12 }, 
				{ 8, 14, 20, 24 }, 
				{ 34, 36, 39, 50, 55 }, 
				{ 22, 56, 44, 88, 77, 99 } 
			};
		int tagret =56;
		int[] ans = search(arr, tagret);
		System.out.println(Arrays.toString(ans));
	}
	
	public static int[] search(int arr[][], int target) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (target == arr[row][col]) {
					return new int[] { row, col };
				}
			}
		}
		return new int[] { -1, -1 };
	}

}
