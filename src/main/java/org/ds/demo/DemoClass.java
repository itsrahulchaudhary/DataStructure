package org.ds.demo;

import java.util.Arrays;

public class DemoClass {
    public static void main(String[] args) {

        int arr[][] = {
                {2, 5, 12},
                {8, 14, 20, 24},
                {34, 36, 39, 50, 55},
                {22, 56, 44, 88, 77, 99}
        };
        int tagret = 56;
        System.out.print(Arrays.toString(search(arr, tagret)));

    }

    public static int[] search(int arr[][], int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }


    public static int findNumber(int arr[]) {
        int count = 0;
        for (int n : arr) {
            if (evenDigit(n)) {
                count++;
            }
        }
        return count;
    }


    public static boolean evenDigit(int num) {
        int noOfDigit = digit(num);
        if (noOfDigit % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int digit(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static boolean lSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }


    public static int linearSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;

    }

    public static void secSmall(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("2nd Small :: " + arr[1]);

    }

    public static void secLarg(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("2nd Lar :: " + arr[1]);

        for (int el : arr) {
            System.out.print(el + " ");
        }

    }


    public static void sepZero(int arr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static void segregates(int arr[]) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        for (int el : arr) {
            System.out.print(el + " ");
        }

    }


    public static void pairSum1(int arr[], int sum) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] > sum) {
                j--;
            } else if (arr[i] + arr[j] < sum) {
                i++;
            } else {
                System.out.println(arr[i] + " : " + arr[j]);
                i++;
                j--;
            }
        }
    }


    public static void pairSum(int arr[], int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }


    public static void fib(int n) {
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        System.out.print(arr[n]);

    }

    public static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void min1(int arr[]) {
        int min = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        System.out.print("Min1 :: " + min);
    }

    public static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("Min :: " + min);
    }

    public static void max1(int arr[]) {
        int max = arr[0];
        for (int el : arr) {
            if (el > max) {
                max = el;
            }
        }
        System.out.print("Max1 :: " + max);
    }

    public static void max(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("Max :: " + max);
    }
}
