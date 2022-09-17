package org.ds.arrays;

public class B04BSFloorOfNo {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8,10, 15, 20, 24, 26, 28, 30 };
        int floorNo = floor(arr, 12);
        System.out.println(floorNo);
    }

    public static int floor(int arr[], int target) {
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
        return end;
    }
}
