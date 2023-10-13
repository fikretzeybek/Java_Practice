package day05;

import java.util.Scanner;

public class F02_ForLoops {
    public static void main(String[] args) {
        /*
Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
 */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen birinci pozitif  tam sayiyi giriniz : ");
        int sayi1 = scanner.nextInt();
        System.out.println("Lutfen ikinci pozitif  tam sayiyi giriniz : ");
        int sayi2 = scanner.nextInt();

        int toplam = 0;

        if (sayi2<sayi1){
            System.out.println("Girilen degerler uygun degildir, tekrar giriniz : ");

        }

        for (int i = sayi1; i <= sayi2 ; i++) {

            toplam += i;

            System.out.println("Toplam : " + toplam);

        }





    }
}
