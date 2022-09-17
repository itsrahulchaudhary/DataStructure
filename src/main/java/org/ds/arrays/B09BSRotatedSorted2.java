package org.ds.arrays;
// 81. Search in Rotated Sorted Array II
public class B09BSRotatedSorted2 {
    public static void main(String[] args) {
       // int nums[] = {2,5,6,0,0,1,2};
        int nums[] = {1,0,1,1,1};
        // [1,0,1,1,1]
        //0
        boolean ans = search(nums,0);
        System.out.print(ans);
    }

    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end  = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return true;
            }
            // the left side is sorted
            if(nums[start]<nums[mid]){
                if(target>=nums[start] && target<=nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else if(nums[start]>nums[mid]){
                // the right side is sorted
                if(target>=nums[mid] && target<=nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                // when we are not sure on which half value is present
                // nums[start]==nums[mid]==nums[end]
               start++;
            }

        }

        return false;

    }
}
