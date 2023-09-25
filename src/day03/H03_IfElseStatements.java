package day03;

import java.util.Scanner;

public class H03_IfElseStatements {
    public static void main(String[] args) {
 /*

    2-Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
    yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
    olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

  */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Cinsiyetinizi E veya K olarak giriniz: ");
        char cinsiyet = scanner.next().charAt(0);

        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        if (cinsiyet == 'K' || cinsiyet == 'k' && yas >= 60) {
            System.out.println("Emekli olabilirsiniz");
        }
        if (cinsiyet == 'K' || cinsiyet == 'k' && yas < 60) {
            System.out.println("Emekli olmak için " + (60 - yas) + " yıl daha çalışmalısınız");
        }
        if (cinsiyet == 'E' || cinsiyet == 'e' && yas >= 65) {
            System.out.println("Emekli olabilirsiniz");
        }
        if (cinsiyet == 'E' || cinsiyet == 'e' && yas < 65) {
            System.out.println("Emekli olmak için " + (65 - yas) + " yıl daha çalışmalısınız");
        }
        if (!(cinsiyet == 'E' || cinsiyet == 'e' || cinsiyet == 'K' || cinsiyet == 'k')) {
            System.out.println("Cinsiyeti yanlis girdiniz, tekrar giriniz ");
        }
    }

    /*
    Not: Birden fazla if,elseif, else durumlarında en son adıma bakılır
    else ile bitiyorsa tüm ihtimaller kapsanır.
    else if ile bitiyorsa kapsanmayan ihtimaller vardır.
     */
}

