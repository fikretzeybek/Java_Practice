package F08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F06_tamSayiBolenListesi {

    public static void main(String[] args) {
        /*
          Soru-2:
           Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
           tamsayilari bir liste olarak bize donduren bir method olusturun.
                                                                                 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir tam sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        List<Integer> tamBolenler = tamBolenleriBul(girilenSayi);

        System.out.println("Tam bölenler: " + tamBolenler);
    }

    private static List<Integer> tamBolenleriBul(int sayi) {
        List<Integer> tamBolenler = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                tamBolenler.add(i);
            }
        }

        return tamBolenler;
    }
}