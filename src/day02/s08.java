package day02;

import java.util.Scanner;

public class s08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
        //yazin

        //int s1 = 12;
        //int s2 = 21;
        //int s3 = 378;

        //System.out.println((double) (s1 + s2 + s3)/3);

        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        System.out.println("Lutfen bir harf giriniz");
        char harf = scanner.next().charAt(0);

        char birSonraki1 = (char) (harf+1);
        System.out.println(birSonraki1);
        char birSonraki2 = (char) (harf+2);
        System.out.println(birSonraki2);
        char birSonraki3 = (char) (harf+3);
        System.out.println(birSonraki3);

        System.out.println("===========");

        System.out.println((char) ((int) harf +1));
        System.out.println((char) ((int) harf +2));
        System.out.println((char) ((int) harf +3));

        //Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.

        // System.out.println("Lutfen bir sayi giriniz");
        // int sayi = scanner.nextInt();
        // System.out.println((byte)sayi);

        //Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

       //System.out.println("Lutfen iki tane double sayi giriniz ");
       //double s1= scanner.nextDouble();
       //double s2= scanner.nextDouble();
       //double ortalama = s1/s2;
       //System.out.println((int)ortalama);

        //Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin

        System.out.println("Lutfen double bir sayi giriniz");
        double s01 = scanner.nextDouble();
        System.out.println("Lutfen tam bir sayi giriniz");
        int s02 = scanner.nextInt();

        System.out.println((int) s01/s02);


    }
}
