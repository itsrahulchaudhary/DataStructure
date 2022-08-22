package org.ds.arrays;


import java.util.Arrays;

public class D01BubbleSort {

    public static void main(String[] args) {
        int arr[] = {10, 40, 20, 30, 90, 50};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));

    }

    public static void bubbleSort(int arr[]) {
        boolean swapped;
        // run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

}
