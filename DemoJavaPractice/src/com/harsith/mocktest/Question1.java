package com.harsith.mocktest;
class MyClass {
    static {
        System.out.println("Static block 1");
    }

    static {
        System.out.println("Static block 2");
    }


}

public class Question1 {
    public static void main(String[] args) {
        MyClass hr=new MyClass();

    }
}
