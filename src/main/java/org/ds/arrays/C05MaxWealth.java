package org.ds.arrays;
// Richest customer wealth
// input [[1,2,3] , [3,2,1]]
// output = 6
public class C05MaxWealth {

	public static void main(String[] args) {

	}

	public int maxWealth(int accounts[][]) {
		// person = row
		// account = col
		int ans = 0;
		for (int person = 0; person < accounts.length; person++) {
			int sum = 0;
			for (int account = 0; account < accounts[person].length; account++) {
				sum += accounts[person][account];
			}
			if (sum > ans) {
				ans = sum;
			}
		}
		return ans;
	}

}
