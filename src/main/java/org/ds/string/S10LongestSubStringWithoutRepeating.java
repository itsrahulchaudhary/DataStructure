package org.ds.string;

import java.util.LinkedHashMap;
import java.util.Map;

// Java Program To Find Longest Substring Without Repeated Character
public class S10LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        String input = "java";
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char[] arr = input.toCharArray();
        int longestSubStringLength = 0;
        String longestSubstring = null;

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (!map.containsKey(ch)) {
                map.put(ch, i);
            } else {
                i = map.get(ch);
                map.clear();
            }

            if (map.size() > longestSubStringLength) {
                longestSubStringLength = map.size();
                longestSubstring = map.keySet().toString();
            }
        }
        System.out.println("Longest Substring : " + longestSubstring);
        System.out.println("Longest Substring Length :" + longestSubStringLength);

    }

}
