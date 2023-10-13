package day05;

import java.util.Scanner;

public class ters {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin= scanner.nextLine();

        String tersMetin="";

        for (int i = metin.length()-1; i >= 0 ; i--) {

            tersMetin += metin.substring(i,i+1);
        }

        metin=tersMetin;
        System.out.println(metin);
    }
}
