package com.wyp.udf.utils;

public class Hello {

    public void sayHello(String word) {
        System.out.println("hello, " + word);
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        String str = "word. bingo!";
        hello.sayHello(str);
    }

}
