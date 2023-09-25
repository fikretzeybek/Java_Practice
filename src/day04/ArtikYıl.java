package day04;

import java.util.Scanner;

public class ArtikYıl {
    public static void main(String[] args) {
         /*
    Soru ) Interview Question
    Kullanicidan artik yil olup olmadigini kontrol
    etmek icin yil girmesini isteyin.
    Kural 1: 4 ile bolunen yillar artik yildir
    Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
    Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan
    sadece 400’un kati olan yillar artik yildir
     */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bilgi istediğiniz yılı giriniz: ");
        int year = scan.nextInt();

        System.out.println("Ternary ile Cozum : ");

        String sonuc = year % 100 == 0 ? year % 400 == 0 ? "Girdiğiniz yıl bir Artık Yıldır" : "Girdiğiniz yıl bir Artık Yıl Degildir" :
                       year % 4 == 0 ? "Girdiğiniz yıl bir Artık Yıldır" : "Girdiğiniz yıl bir Artık Yıl Degildir";
        System.out.println(sonuc);

        System.out.println("");

        System.out.println("IfStatements ile Cozum : ");

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Girdiğiniz yıl bir Artık Yıldır");
        } else if ( year % 4 == 0 && year % 100!= 0) {
            System.out.println("Girdiğiniz yıl bir Artık Yıldır");
        } else {
            System.out.println("Girdiğiniz yıl bir Artık Yıl Degildir");
        }


    }
}
