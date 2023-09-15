package day03;

import java.util.Scanner;

public class C01_DataCasting {
    public static void main(String[] args) {

        //1-Double olarak verilen 3 sayının toplamını int olarak yazdırın

        double s1 = 23, s2 = 34, s3 = 45.89;

        int toplam = (int) (s1 + s2 + s3) ;

        System.out.println("Double sayilarin int olarak toplami : " + toplam);

        /*
2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
    Girdiğiniz harf :
    Girdiğiniz harften sonraki  3 harf :
şeklinde yazdırın.
ipucu: char
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz : ");
        char harf = scanner.next().charAt(0);

        System.out.println("Girdiginiz harf :" + harf);
        System.out.print("Girdiğiniz harften sonraki  3 harf : " +(char) (harf + 1) + " , ");
        System.out.print((char) (harf + 2) + " , ");
        System.out.print((char) (harf + 3));




    }
}
