package org.ds.demo;

public class DemoClass {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 7, 19, 1,12 };
     //   System.out.println(isSorted(arr));
        min(arr);
    }

    public static boolean isSorted(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void max(int arr[]){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
          if(arr[i]>max){
              max=arr[i];
          }
        }
        System.out.println(max);
    }

    public static void min(int arr[]){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }






}
