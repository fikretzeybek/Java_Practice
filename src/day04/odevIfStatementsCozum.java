package day04;

import java.util.Scanner;

public class odevIfStatementsCozum {
    public static void main(String[] args) {
          /*
         Kullanicidan gunu ismini girmesini isteyin,
           -girilen gun hafta ici bir gun ise : "Simdi calisma zamani tatile .. gun var"
          - girilen gun hafta sonu ise : "Simdi dinlenme zamani" yazdirin.
           */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir gun adi giriniz : ");
        String gunAdi = scanner.nextLine().toLowerCase();

        if (gunAdi.equals("pazartesi")) {
            System.out.println("Simdi calisma zamani, tatile 5 gün var.");
        } else if (gunAdi.equals("salı")) {
            System.out.println("Simdi calisma zamani, tatile 4 gün var.");
        } else if (gunAdi.equals("çarşamba")) {
            System.out.println("Simdi calisma zamani, tatile 3 gün var.");
        } else if (gunAdi.equals("perşembe")) {
            System.out.println("Simdi calisma zamani, tatile 2 gün var.");
        } else if (gunAdi.equals("cuma")) {
            System.out.println("Simdi calisma zamani, tatile 1 gün var.");
        } else if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
            System.out.println("Simdi dinlenme zamani.");
        } else {
            System.out.println("Gecersiz bir gun adi girdiniz, lutfen tekrar giriniz :");
        }

    }
}
