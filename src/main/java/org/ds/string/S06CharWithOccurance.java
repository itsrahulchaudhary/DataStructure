package org.ds.string;

import java.util.Arrays;

// Java Program To Replace Character With It's Occurrence
public class S06CharWithOccurance {
    public static void main(String[] args) {

        String input = "opentext";
        char charToReplace = 't';
        // expected output = open1ex2

        // check char present in string
        if (input.indexOf(charToReplace) == -1) {
            System.out.println("Given Character Not Available In Input String...");
            System.exit(0);
        }

        // logic to replace char occurance in string

        //Apporach-1 // USE
        char[] arr = input.toCharArray(); // o p e n 1 e x 2
        int cnt = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == charToReplace) {// o==t, p==t, e==t, n==t, t==t, e==t, x==t, t==t
                arr[i] = String.valueOf(cnt).charAt(0);
                cnt++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);


        //Apporach-2
        int count=1;
        for(int i=0; i<arr.length;i++) {
            char ch = input.charAt(i);
            if(ch == charToReplace) {
                input = input.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
                count++;
            }
        }
        System.out.println(input);
    }

}
