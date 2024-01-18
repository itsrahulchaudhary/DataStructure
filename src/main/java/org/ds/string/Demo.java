package org.ds.string;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        String str = "AABBCDE";
       char arr[] = str.toCharArray();
       for(int i=0; i<arr.length; i++){
           boolean flag = false;
           for (int j=i+1; j<arr.length; j++){
               if(arr[i]==arr[j]){
                   flag = true;
                   break;
               }
           }
           if(flag==false){
               System.out.println(arr[i]);
               break;
           }


       }
    }
}
