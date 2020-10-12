package com.pbo;

public class method_if_else {
    static void checkAge(int age){
        if ((age <18)){
            System.out.println("accses denied- kamu tidak cukup umur !");
        }else {
            System.out.println("acces grandted- kamu cukup umur!");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}
