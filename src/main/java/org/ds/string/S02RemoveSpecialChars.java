package org.ds.string;

public class S02RemoveSpecialChars {
    public static void main(String[] args) {
        String str = "$ja!va*$st%ar";
        String planstr = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(planstr);
    }

}
