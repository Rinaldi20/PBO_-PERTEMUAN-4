package com.pbo;
import java.util.Scanner;
import java.lang.String;
public class recursivebercabang {
    public static void main(String[] args) {
       Scanner userinput = new Scanner(System.in);
        System.out.print("masukan nilai = ");
       int nilai = userinput.nextInt();
       int nilaifinobacci = finobacci(nilai);
        System.out.println("finobacci ke "+nilai+" adalah "+nilaifinobacci );
    }
    private static int finobacci(int n){
        System.out.println("finobacci ke " + n);
        if (n==0 || n==1){
            return n;
        } else {

        return finobacci(n-1)+ finobacci(n-2);
        }

    }

}