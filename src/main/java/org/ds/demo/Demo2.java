package org.ds.demo;

public class Demo2 {

    public static void main(String[] args) {
        //int arr[] = {2,4,6,8,20,35,1,10};
        //int arr[] = {2,4,6,8,50,1,20,35};
       // System.out.println(isSorted(arr));
        //isSorted(arr);
       // min(arr);
       // fib(6);

//        int arr[] = { 2, 3, 5, 1, 6, 4 };
//        int sum = 6;
//        pairSum2(arr,sum);
        int arr[] = { 2, -1, 4, -8, 3, 5, -9 };
        segregates(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }


    }

    public static void segregates(int arr[]){
        int i=0;
        for(int j=0; j<arr.length; j++){
            if(arr[j]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }


    public static void pairSum2(int arr[], int sum){
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]>sum){
                j--;
            } else if (arr[i]+arr[j]<sum) {
                i++;
            }else {
                System.out.println(arr[i]+" : "+arr[j]);
                i++;
                j--;
            }
        }
    }

    public static void pairSum(int arr[], int sum){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+" : "+arr[j]);
                }
            }
        }
    }


    public static void fib(int n){
        int ar[] = new int[n+1];
        ar[0] = 0;
        ar[1] = 1;
        for(int i=2; i<ar.length; i++){
            ar[i] = ar[i-2]+ar[i-1];
        }
        System.out.println(ar[ar.length-1]);
    }
    public static void min(int arr[]){
        int mn = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<mn){
                mn = arr[i];
            }
        }
        System.out.println(mn);
    }
    public static void max(int arr[]){
        int mx = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        System.out.println(mx);
    }
    public static boolean isSorted(int arr[]){
        for(int i=1; i<arr.length; i++){
            System.out.println("P : "+i+" : "+arr[i]);
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }


}
