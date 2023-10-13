package day05;

import java.util.Scanner;

public class F01_ForLoops {
    public static void main(String[] args) {
          /*
SORU:Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
dahil) 7 ile bolunebilen sayilari yazdirin.
 */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz : ");
        int sayi = scanner.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 7 == 0) {
                System.out.println(i + " sayisi 7'e tam olarak bolunebilmektedir.");
            }

        }
        System.err.print("===Islem Bitti===");
    }
}
