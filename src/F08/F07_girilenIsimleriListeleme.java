package F08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F07_girilenIsimleriListeleme {

    public static void main(String[] args) {
        /*
            Soru-1:
            Kullanicidan istedigi kadar isim alip, Q'ya bastiginda girdigi isimleri bize
            liste olarak dondurecek bir method olusturun.
                                                            */
        girilenIsimleriListele();

    }
    private static List<String> girilenIsimleriListele() {
        List<String> isimListesi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Girmek istediğiniz isimleri yazınız : \nÇıkmak için 'Q' tuşuna basınız ");
        while (true) {
            String isim = scanner.nextLine();
            if (isim.equalsIgnoreCase("Q")) {
                break;
            }
            isimListesi.add(isim);
        }
        if (isimListesi.isEmpty()) {
            System.out.println("İsim girişi yapılmamıştır.");
        } else {
            System.out.print("Girdiğiniz isimler: ");
            for (int i = 0; i < isimListesi.size() - 1; i++) {
                System.out.print(isimListesi.get(i) + ", ");
            }
            System.out.print(isimListesi.get(isimListesi.size() - 1));
        }

        return isimListesi;
    }
}