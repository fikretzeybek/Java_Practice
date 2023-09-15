package day03;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        /*
1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
    85-100 -----> AA
    80-85 ------> BA
    75-80 ------> BB
    65-75 ------> CB
    50-65 ------> CC
    50 Altı ise  ------> FF
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu 100 puan uzerinden giriniz");
        int not = scanner.nextInt();

        if (not >= 85 && not <= 100) {
            System.out.println("Notunuzun harf karsiligi :  AA" );

        } else if (not >= 80 && not < 85) {
            System.out.println("Notunuzun harf karsiligi :  BA" );

        } else if (not >= 75 && not < 80) {
            System.out.println("Notunuzun harf karsiligi :  BB " );

        } else if (not >= 65 && not < 75) {
            System.out.println("Notunuzun harf karsiligi :  CB" );

        } else if (not >= 50 && not < 65) {
            System.out.println("Notunuzun harf karsiligi :  CC" );

        } else if (not < 50 && not >0) {
            System.out.println("Notunuzun harf karsiligi :  FF" );

        } else if (not > 100 || not <= 0) {
            System.out.println("Notunuzu 0 ile 100 arasında bir deger giriniz!");
        }


    }
}