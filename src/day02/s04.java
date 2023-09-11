package day02;

import java.util.Scanner;

public class s04 {
    public static void main(String[] args) {
        /*Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
kucukse “Maalesef kaldin” yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Lutfen notunuzu giriniz");
        //int not = scanner.nextInt();

        //if (not >= 50){
        //    System.out.println("Sinifi gectin");
        //} else if (not<50) {
        //    System.out.println("Maalesef kaldin");
        //}

        /*Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
olarak yazdirin, yoksa girilen harfi yazdirin         */

        System.out.println("Lutfen bir harf giriniz");
        char hrf = scanner.next().charAt(0);

        if (Character.isLowerCase(hrf)) {
            System.out.println(Character.toUpperCase(hrf));
        } else {
            System.out.println(hrf);
        }


    }
}
