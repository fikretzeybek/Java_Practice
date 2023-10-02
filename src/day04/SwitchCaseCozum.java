package day04;

import java.util.Scanner;

public class odevSwitchCaseCozum {
    public static void main(String[] args) {
         /*
         Kullanicidan gunu ismini girmesini isteyin,
           -girilen gun hafta ici bir gun ise : "Simdi calisma zamani tatile .. gun var"
          - girilen gun hafta sonu ise : "Simdi dinlenme zamani" yazdirin.
           */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir gun adi giriniz : ");
        String gunAdi = scanner.nextLine().toLowerCase();

        switch (gunAdi) {
            case "pazartesi":
                System.out.println("Simdi calisma zamani tatile 5 gun var");
                break;
            case "sali":
                System.out.println("Simdi calisma zamani tatile 4 gun var");
                break;
            case "carsamba":
                System.out.println("Simdi calisma zamani tatile 3 gun var");
                break;
            case "persembe":
                System.out.println("Simdi calisma zamani tatile 2 gun var");
                break;
            case "cuma":
                System.out.println("Simdi calisma zamani tatile 1 gun var");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Simdi dinlenme zamani.");
                break;
            default:
                System.out.println("Gecersiz gun adi girdiniz, lutfen tekrar giriniz :");
                break;
        }

    }
}
