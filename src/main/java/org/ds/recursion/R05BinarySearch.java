package org.ds.recursion;

public class R05BinarySearch {

    public static void main(String[] args) {
        int arr[] = {3,6,8,10,15,23,25};
        int target = 10;
        int e = arr.length-1;
        int ans = search(arr,target,0,e);
        System.out.println(ans);

    }

    public static int search(int arr[], int target,int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1,e);
    }
}
