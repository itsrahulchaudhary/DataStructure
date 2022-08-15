package org.ds.arrays;

import java.util.Arrays;

// Find First and Last Position of Element in Sorted Array
public class B06BSFirstAndLastPosition {

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;
        int res[] = searchRange(nums, target);
        System.out.print(Arrays.toString(res));
    }


    public static int[] searchRange(int[] nums, int target) {
        // answer not found
        int[] ans = {-1, -1};

        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    // this function just return the index value of target
    public static int search(int[] nums, int target, boolean firstStartIndex) {
        // potential answer
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential answer found
                ans = mid;
                if (firstStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


}
