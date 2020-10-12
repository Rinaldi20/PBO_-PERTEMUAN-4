package com.pbo;

public class fungsi_method {
  public static void main (String [] args){
      int a , b;
      a = 10;
      b = hitung(a) ;
      System.out.println(" a ="+ a +" b ="+ b);

      a = 20;
      b = a * a ;
      System.out.println(" a ="+ a +" b ="+ b);

  }
        static int hitung ( int a){
      int hasil ;
      hasil = a * a ;
       
      return hasil;
        }
}
