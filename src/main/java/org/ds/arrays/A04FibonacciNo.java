package org.ds.arrays;

public class A04FibonacciNo {

	public static void main(String[] args) {
		System.out.println(fibNo(6));

	}

	public static int fibNo(int no) {
		int arr[] = new int[no + 1];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i <= no; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		return arr[no];
	}

}
