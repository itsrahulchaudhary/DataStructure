package org.ds.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class S04RemoveDupChars {
    public static void main(String[] args) {
        String str = "programming";

        // Approach-1 // USE
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c -> sb1.append((char) c));
        System.out.println(sb1);

        System.out.println("------------------------------------------");

        // Approach-2
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int indexOf = str.indexOf(ch, i + 1);
            if (indexOf == -1) {
                sb2.append(ch);
            }
        }
        System.out.println(sb2);

        System.out.println("------------------------------------------");

        // Approach-3 // USE
        StringBuilder sb3 = new StringBuilder();
        char[] chArr = str.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            boolean repated = false;
            for (int j = i + 1; j < chArr.length; j++) {
                if (chArr[i] == chArr[j]) {
                    repated = true;
                    break;
                }
            }
            if (!repated) {
                sb3.append(chArr[i]);
            }
        }
        System.out.println(sb3);

        System.out.println("------------------------------------------");

        // Approach-4
        StringBuilder sb4 = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0; i<str.length(); i++) {
            set.add(str.charAt(i));
        }
        for(Character ch : set) {
            sb4.append(ch);
        }
        System.out.println(sb4);
    }

}
