package org.ds.string;

public class S09ReverseEachWordInString {
    public static void main(String[] args) {

        String input = "java code";
        System.out.println("Original String :: " + input);
        String[] words = input.split(" ");
        String output = "";
        for (String word : words) {
            String revWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                revWord = revWord + word.charAt(i);
            }
            output = output + revWord + " ";
        }

        System.out.println("Reversed String :: " + output);
    }
}
