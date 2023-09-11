package day02;

import java.util.Scanner;

public class s06 {
    public static void main(String[] args) {
        /*Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
        zamani” yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir gun adi giriniz");
        String gunAdi = scanner.next().toLowerCase();

        if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
            System.out.println("Simdi dinlenme zamani");

        } else if (gunAdi.equals("pazartesi")) {
            System.out.println("Simdi calisma zamani tatile 5 gun var");
        } else if (gunAdi.equals("sali")) {
            System.out.println("Simdi calisma zamani tatile 4 gun var");
        } else if (gunAdi.equals("carsamba")) {
            System.out.println("Simdi calisma zamani tatile 3 gun var");
        } else if (gunAdi.equals("persembe")) {
            System.out.println("Simdi calisma zamani tatile 2 gun var");
        } else if (gunAdi.equals("cuma")) {
            System.out.println("Simdi calisma zamani tatile 1 gun var");

        }

        switch (gunAdi) {
            case "cumartesi":
            case "pazar":
                System.out.println("Simdi dinlenme zamani");
                break;
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



        }

    }
}
