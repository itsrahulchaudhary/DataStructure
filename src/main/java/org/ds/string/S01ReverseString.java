package org.ds.string;

public class S01ReverseString {

    public static void main(String[] args) {

        // USE
        String str = "rahul";
        char ch[] = str.toCharArray();
        for(int i = ch.length-1; i>=0; i--){
            System.out.print(ch[i]);
        }
        System.out.println(" ");

        // USE
        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println(" ");

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        StringBuilder sbb = new StringBuilder(str);
        System.out.println(sbb.reverse());

    }
}
