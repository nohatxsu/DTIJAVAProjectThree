package com.sau.dti.method;

public class MyClassMet01 {
    public static void showHi() {
        System.out.println("Hi...");
    }

    public static void ShowHello() {
        System.out.println("Hello...");
    }

    public static void main(String[] args) {
        showHi();
        showHi();
        showHey();
    }

    public static void showHey() {
        System.out.println("Hey...");
        showHi();
    }
}
