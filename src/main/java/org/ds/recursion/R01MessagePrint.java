package org.ds.recursion;
// Basic Question before starting recursion
public class R01MessagePrint {
    public static void main(String[] args) {
        message1();

    }

    public static void message1(){
        System.out.println("Hello World");
        message2();
    }

    public static void message2(){
        System.out.println("Hello World");
        message3();
    }

    public static void message3(){
        System.out.println("Hello World");
        message4();
    }

    public static void message4(){
        System.out.println("Hello World");
        message5();
    }

    public static void message5(){
        System.out.println("Hello World");
    }




}
