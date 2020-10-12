package com.pbo;

public class overloadmethod {
    public static void main(String[] args) {
        float hasilfloat = tambah(6,7.7f);
        printangka(hasilfloat);
        printangka(5);
        printangka(5.8f);

    }
    private static void printangka(int angkainteger){
        System.out.println(" angka ini adalah integer dengan nilai = "+angkainteger);
    }
    private static void printangka(float angkafloat){
        System.out.println(" angka ini adalah integer dengan nilai = "+angkafloat);
    }
    private static float tambah(int angkainteger1, float angkafloat1){
       return angkainteger1 + angkafloat1;
    }
}

