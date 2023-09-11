package day02;

import java.util.Scanner;

public class s05 {
    public static void main(String[] args) {
        /*Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin*/

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Lutfen yasinizi giriniz");
        //int girilenYas = scanner.nextInt();

        //if (girilenYas >= 65){
        //    System.out.println("Emekli olabilirsin");

        //}else {
        //    System.out.println("Calisman gereken yil sayisi = " + (65-girilenYas));
        //
        //}

        /*Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        olup olmadigini yazdirin.*/

        System.out.println("Lutfen bir karakter giriniz");
        char krk = scanner.next().charAt(0);

        if (Character.isUpperCase(krk)) {
            System.out.println("Girilen karakter buyuk harftir");
        } else {
            System.out.println("Girilen karakter buyuk harf degil");
        }


        // 2. yol

        if (krk >= 'a' && krk <= 'z') {
            System.out.println(Character.toUpperCase(krk));

        } else {
            System.out.println(krk);
        }


    }
}
