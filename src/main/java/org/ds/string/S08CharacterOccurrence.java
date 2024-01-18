package org.ds.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class S08CharacterOccurrence {
    public static void main(String[] args) {
        String input = "helloll";
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char[] chars = input.toCharArray();

        for (char ch : chars) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                Integer value = map.get(ch);
                map.put(ch, value + 1);
            }
        }
        System.out.println(map);
    }
}
