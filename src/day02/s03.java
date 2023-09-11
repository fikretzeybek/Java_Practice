package day02;

import java.util.Scanner;

public class s03 {
    public static void main(String[] args) {
        /*Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Bir sayi giriniz");
        //int sayi = scanner.nextInt();

        //if (sayi % 3 == 0) {
        //    System.out.println("Uc ile bolunebilen sayi");

        //} else if (sayi % 5 == 0) {
        //    System.out.println("Bes ile bolunebilen sayi");
        //}

        /*Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
“istediginiz birim sisteme kayitli degil” yazdirin.*/

        System.out.println("Lutfen mesafeyi Kilometre olarak giriniz");
        int msf = scanner.nextInt();
        System.out.println("Hangi birime cevirmek istiyorsunuz   \nMetre=m \nSantimetre=s");
        String birim = scanner.next().toLowerCase();

        if (birim.equals("m")) {
            System.out.println("Sonuc=" + (msf * 1000) + " metre");

        } else if (birim.equals("s")) {
            System.out.println("Sonuc=" + (msf * 100000) + " santimetre");

        } else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }


    }
}
