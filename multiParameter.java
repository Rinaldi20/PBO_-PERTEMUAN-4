package com.pbo;

public class multiParameter {
    static void myMethod(String fname , int age){
        System.out.println(fname + " is "+ age);
    }

    public static void main(String[] args) {
        myMethod("liam",5);
        myMethod("jenny",8);
        myMethod("anja",41);
    }
}
