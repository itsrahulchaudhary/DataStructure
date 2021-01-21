package com.algo.sorting;

public class BubbleSortString {
	public static void main(String[] args) {
		String arr[] = { "rahul", "umesh", "vijay", "sandeep", "rohit" };
		for (int i = 0; i < arr.length; i++) {
			String temp = "";
			int flag = 0;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
