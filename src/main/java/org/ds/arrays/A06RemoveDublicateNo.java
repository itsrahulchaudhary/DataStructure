package org.ds.arrays;

public class A06RemoveDublicateNo {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 2, 1, 4,1, 5 };
		System.out.println(removeDublicate(arr));

	}

	public static int removeDublicate(int arr[]) {
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			x = x ^ arr[i];
		}
		return x;
	}
}
