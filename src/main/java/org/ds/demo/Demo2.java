package org.ds.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

// Leadcode : 69. Sqrt(x)
public class Demo2 {

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;
        int ans[]= firstAndLast(nums,target);
        System.out.print(Arrays.toString(ans));
    }

    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        boolean asc = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(asc){
                if(target<arr[mid]){
                    end =mid-1;
                }else if(target>arr[mid]){
                    start = mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end =mid-1;
                }else if(target<arr[mid]){
                    start = mid+1;
                }
            }

        }
        return -1;
    }

    public static int ceilingNo(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid= start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }

    public static int floar(int arr[], int target){
        int start =0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end =mid-1;
            }else if(target>arr[mid]){
                start= mid+1;
            }else {
                return mid;
            }
        }
        return end;
    }

    public static char smallest(char ch[], char target){
        int start = 0;
        int end = ch.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(target<ch[mid]){
                end=mid-1;
            }else if(target>ch[mid]){
                start=mid+1;
            }
        }
        return ch[start % ch.length];
    }

    public static int[] firstAndLast(int arr[], int target){
        int ans[] ={-1,-1};
        ans[0]= search(arr,target,true);
        ans[1]= search(arr,target,false);
        return ans;
    }

    public static int search(int arr[], int target, boolean firstPosition){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else {
                ans=mid;
                if(firstPosition){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }

        return ans;
    }
}
