package day03;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
        /*
2-Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak "Emekli
olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.
*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetini zi giriniz : \nErkek:E  \nKadin:K");
        char cinsiyet = scanner.next().toLowerCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scanner.nextInt();

        if (cinsiyet == 'e' && yas >= 65 || cinsiyet == 'k' && yas >= 60) {
            System.out.println("Emekli olabilirsiniz");

        }
        if (cinsiyet == 'e' && yas < 65) {
            System.out.println("Emekli olmak icin daha " + (65 - yas) + " yil daha calismaniz gerekiyor.");

        }
        if (cinsiyet == 'k' && yas < 60) {
            System.out.println("Emekli olmak icin daha " + (60 - yas) + "  yil daha calismaniz gerekiyor.");

        }
        if(!(cinsiyet == 'e' || cinsiyet == 'k')){
            System.out.println("Cinsiyetinizi yanlis girdiniz, tekrar giriniz");
        }




    }

}
