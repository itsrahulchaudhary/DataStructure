package org.ds.arrays;

public class A11MissingNumber {

    public static void main(String[] args) {

        int arr[] = {1, 5, 2, 4, 6, 8, 7,3, 9,10};
        int num = findNumber(arr);
        System.out.print(num);

    }

    public static int findNumber(int arr[]) {
        for (int i = 1; i <=10; i++) {
            boolean isPresent = isPresent(arr, i);
            if (!isPresent)
                return i;
        }
        return 0;
    }

    public static boolean isPresent(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return true;
        }
        return false;
    }


}
