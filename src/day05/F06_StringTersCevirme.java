package day05;

import java.util.Scanner;

public class F06_StringTersCevirme {
    public static void main(String[] args) {

    //Kullanicidan bir String isteyin ve String'i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen tersine cevirmek istediginiz metni giriniz");
        String metin = scanner.nextLine();
        String tersMetin ="";

        for (int i = metin.length(); i >= 0 ; i--) {

            tersMetin += metin.substring(i-1,i);
            // tersMetin.append(metin.charAt(i - 1)); yapilabilir

        }
        metin = tersMetin;
        System.out.println(metin);

    }
}
