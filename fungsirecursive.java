package com.pbo;
import java.util.Scanner;
public class fungsirecursive {
    public static void main (String[] args){
        Scanner userinput = new Scanner(System.in);
        System.out.print("masukan nilai = ");
        int nilai = userinput.nextInt();

        printnilai(nilai);

        int jumlah = hitungjumlah(nilai);
        System.out.println("jumlah= "+jumlah);

        long fakorial = hitungfaktorial(nilai);
        System.out.println("hasil faktorial= "+fakorial);
    }
    private static int hitungjumlah(int paremeter){

        if (paremeter == 0){
            return paremeter ;
        }
       return paremeter+hitungjumlah(paremeter - 1);
    }
    private static  long hitungfaktorial(int parameter){
        if (parameter == 1){

            return parameter;
        }
        return parameter * hitungfaktorial(parameter-1);
    }

    private static void printnilai(int parameter){
        System.out.println("nilai ="+parameter);

        if (parameter == 0){
            return;
        }
        parameter--;
       printnilai(parameter);
    }
}
