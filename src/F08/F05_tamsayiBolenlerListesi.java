package F08;

import java.util.Scanner;

public class F05_tamsayiBolenlerListesi {

    public static void main(String[] args) {



        tamsayiBolDondur();
    }

    private static int tamsayiBolDondur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir tam sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        System.out.print("Tam bölenler: ");
        for (int i = 1; i <= girilenSayi; i++) {
            if (girilenSayi % i == 0) {
                System.out.print(i + ",");
            }
        }

        return girilenSayi;
    }
}