package day02;

import java.util.Scanner;

public class s02 {
    public static void main(String[] args) {

        /* Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
                Kullanici o veya O yazdiginda output Ocak olsun */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir harf girin");
        String harf = scanner.next().toLowerCase();


        if (harf.startsWith("o")){
            System.out.println("Ocak");
        }
        if (harf.startsWith("s")){
            System.out.println("Subat");
        }
        if (harf.startsWith("m")){
            System.out.println("Mart, Mayis");
        }
        if (harf.startsWith("n")){
            System.out.println("Nisan");
        }
        if (harf.startsWith("h")){
            System.out.println("Haziran");
        }
        if (harf.startsWith("t")){
            System.out.println("Temmuz");
        }
        if (harf.startsWith("a")){
            System.out.println("Agustos, Aralik");
        }
        if (harf.startsWith("e")){
            System.out.println("Eylul, Ekim");
        }
        if (harf.startsWith("k")){
            System.out.println("Kasim");
        }

    }
}
