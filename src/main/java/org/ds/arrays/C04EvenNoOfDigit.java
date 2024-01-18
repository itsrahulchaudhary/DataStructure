package org.ds.arrays;

public class C04EvenNoOfDigit {
	public static void main(String[] args) {

		int arr[] = { 23, 567, 8, 8732, 341, 23};
		System.out.println(findNumber(arr));
	}

	public static int findNumber(int arr[]) {
		int count = 0;
		for (int num : arr) {
			if (evenCheck(num)) {
				count++;
			}
		}
		return count;
	}

	public static int digit(int num) {
		if(num<0) {
			num=num*-1;
		}
		if(num==0) {
			return 1;
		}
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}
	public static int digit2(int num) {
		if(num<0) {
			num=num*-1;
		}
		return (int)(Math.log10(num))+1;
	}

	public static boolean evenCheck(int num) {
		int noOfDigit = digit(num);
		if (noOfDigit % 2 == 0) {
			return true;
		}
		return false;
	}

}
