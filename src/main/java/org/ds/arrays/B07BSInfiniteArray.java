package org.ds.arrays;

// Find position of an element in a sorted array of infinite numbers
public class B07BSInfiniteArray {
    public static void main(String[] args) {

        int arr[] = {3, 5, 7, 9, 70, 90, 100, 130, 140, 160, 170,180,200,210,240};
        int target = 130;
        int result = ans(arr, target);
        System.out.print(result);

    }

    public static int ans(int arr[], int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            // this is my new index
            int temp = end + 1;
            // double the box size
            // end = previous end + sizeofbox * 22
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int arr[], int target, int start, int end) {
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
        return -1;
    }
}
