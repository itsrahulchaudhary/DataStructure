package org.ds.arrays;

public class B03BSCeilingOfNo {

    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 9,15, 20, 24, 26, 28, 30 };
        int ceilingNO = ceiling(arr, 12);
        System.out.println(ceilingNO);
    }

    // smallest element in an array greater or equal to target
    public static int ceiling(int arr[], int target) {
        if(target>arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

}
