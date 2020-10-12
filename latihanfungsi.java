package com.pbo;
import java.util.Scanner;
public class latihanfungsi {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.print("panjang = ");
        int inputpanjang = userinput.nextInt();
        System.out.print("lebar = ");
        int inputlebar = userinput.nextInt();

        gambar (inputpanjang, inputlebar);
        tampilkan(inputpanjang,inputlebar);
    }
    private static void gambar(int panjang, int lebar){
        for (int i = 0; i < lebar;i++){
            for (int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    private static int luas (int panjang, int lebar){
       int  hasil = panjang * lebar;
        return hasil;
    }
    private static int keliling (int panjang, int lebar){
        int  hasil = panjang + lebar;
        return hasil;
    }
    private static void tampilkan(int panjang, int lebar){
        System.out.println("luas =  "+luas(panjang,lebar));
        System.out.println("keliling ="+keliling(panjang,lebar));
    }
}



