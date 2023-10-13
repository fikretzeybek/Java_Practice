package F05;

import java.util.Scanner;

public class F02_SayininBaamakDegerleriToplami {
    public static void main(String[] args) {
        /*
         * sayinin basamak degerlerinin toplamini while loop ile yapin bir method create ediniz.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz : ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        while (sayi != 0){

            toplam += sayi %10;

            sayi /= 10;

        }

        System.out.println(sayi + " sayisinin basamak degerleri toplami = " + toplam);

    }



}
