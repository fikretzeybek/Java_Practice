package day04;

import java.util.Scanner;

public class P02_NestedIf {
    public static void main(String[] args) {
          /*
 2-Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
alirsa %15, yoksa %10 indirim yapin
   */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen urun adedini giriniz : ");
        int urunAdedi = scanner.nextInt();

        System.out.println("Lutfen urunun liste fiyatini giriniz :");
        double listeFiyati = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi :  \nEvet:e  \nHayir:h");
        char kart = scanner.next().toLowerCase().charAt(0);

        if (kart == 'e') {
            if (urunAdedi > 10) {
                System.out.println("%20 indirimli fiyat : " + listeFiyati * 0.80);
            } else {
                System.out.println("%20 indirimli fiyat : " + listeFiyati * 0.85);
            }

        } else if (kart == 'h') {
            if (urunAdedi > 10) {
                System.out.println("%20 indirimli fiyat : " + listeFiyati * 0.85);
            } else {
                System.out.println("%20 indirimli fiyat : " + listeFiyati * 0.90);
            }

        } else {
            System.out.println("Hatali giris yaptiniz lutfen tekrar giris yapiniz");
        }

    }
}
