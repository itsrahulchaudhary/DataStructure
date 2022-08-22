package org.ds.arrays;

import java.util.LinkedHashMap;

public class A12UniqueElements {
    public static void main(String[] args) {
        int arr[] = {1, 3, 7, 1, 7, 2, 5};
        uniqueElements(arr);
    }

    public static void uniqueElements(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void uniqueElements1(int arr[]){
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0; i<arr.length; i++){
          //  map.put()
        }
    }

}
