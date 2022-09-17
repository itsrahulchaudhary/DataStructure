package org.ds.arrays;
// 33. Search in Rotated Sorted Array
public class B09BSRotatedSorted {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int ans = search(nums,0);
        System.out.print(ans);
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end  = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            // the left side is sorted
            if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target<=nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                // the right side is sorted
                if(target>=nums[mid] && target<=nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }

        }

        return -1;

    }
}
