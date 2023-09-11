package day02;

import java.util.Scanner;

public class s07 {
    public static void main(String[] args) {
        /*Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
yazdirin*/

        Scanner scanner = new Scanner(System.in);
//
        //System.out.println("Lutfen bir double sayi giriniz");
        //double s1 = scanner.nextDouble();
        //System.out.println("Lutfen bir integer sayi giriniz");
        //int s2 = scanner.nextInt();
//
//
//
        //System.out.println("s1+s2 = " +(float) (s1 + s2));
        //System.out.println("s1*s2 = " +(float) s1 * s2);

        /*Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
degerlerini degistirin(swap).*/

        System.out.println("Lutfen ilk sayiyi giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = scanner.nextInt();


        sayi1 = sayi1 + sayi2;// 15+25=40
        sayi2 = sayi1 - sayi2;// 40-15=25
        sayi1 = sayi1 - sayi2;// 40-25 =15

        System.out.println("---------------");
        System.out.println("Swap edilmis sayi 1(sayi1) :" + sayi1);
        System.out.println("Swap edilmis sayi 2(sayi2) :" + sayi2);





    }
}
