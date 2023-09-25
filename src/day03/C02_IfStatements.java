package day03;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        /*
1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
Ornek:  gun=Pazar output = "Hafta sonu"  gun=Sali output = "Hafta ici"
*** String icin equals method'unusalı kullanin
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz : ");
        String gunIsmi = scanner.next().toLowerCase();

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {

            System.out.println("Hafta ici");
        }

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {

            System.out.println("Hafta sonu");
        }

        if (!(gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
              gunIsmi.equals("persembe") || gunIsmi.equals("cuma") || gunIsmi.equals("pazar") ||
              gunIsmi.equals("cumartesi"))) {

            System.out.print("Gecerli gun adi giriniz");
        }


            
    }
}
