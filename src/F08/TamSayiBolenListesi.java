package F08;

import java.util.Scanner;

public class TamSayiBolenListesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir tam sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        String tamBolenler = tamSayiyiBolenleriBul(girilenSayi);
        System.out.println("Tam bölenler: " + tamBolenler);
    }

    private static String tamSayiyiBolenleriBul(int sayi) {
        String tamBolenler = "";
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                tamBolenler += i;
                if (i < sayi) {
                    tamBolenler += ", ";
                }
            }
        }
        return tamBolenler;
    }
}
