package com.pbo;

public class voidtanpareturn {

    public static void main(String[] args) {
        System.out.println(gampang());
        jajalvoid("hai");
        hai("rinaldi");
        jajalvoid("2019071021");
    }
    private static int gampang(){
        return 10 ;
    }
    private static void jajalvoid(String input){
        System.out.println(input);
    }
    private static void hai(String nama){
        System.out.println(nama);
    }
}
/*
public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("masukan nilai n = ");
        int nilai = userInput.nextInt();
        int nilai_fibonacci = fibonacci(nilai, "atas");
        System.out.println("nilai fibonacci ke-"+ nilai +" adalah " + nilai_fibonacci);
    }


    private static int fibonacci(int n, String daun){
        System.out.println("daun " + daun);
        System.out.println("Fibonacci ke - " + n);
        if (n == 1 || n == 0){
            return n;
        }
        else {
            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        }
    }

}

 */