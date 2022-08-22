package org.ds.arrays;

public class C02LinearSearch {
	public static void main(String[] args) {

		String str = "rahul";
		char target = 'u';
		boolean linearSearchString = linearSearchString2(str, target);
		System.out.println(linearSearchString);

	}

	public static boolean linearSearchString(String str, char target) {
		if (str.length() == 0)
			return false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target)
				return true;
		}

		return false;
	}

	public static boolean linearSearchString2(String str, char target) {
		if (str.length() == 0)
			return false;

		for (char ch : str.toCharArray()) {
			if (ch == target)
				return true;
		}

		return false;
	}

}
