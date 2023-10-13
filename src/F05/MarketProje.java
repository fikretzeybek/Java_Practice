package F05;

import java.util.Scanner;

public class MarketProje {

    static Scanner scanner = new Scanner(System.in);
    static double kartIndirimOrani = 0.15;
    static double toplamFiyat = 0;

    public static void main(String[] args) {
        girisEkrani();
    }

    private static void girisEkrani() {
        System.out.println("===== GELVEAL MARKET =====");
        System.out.println("===== HOŞGELDİNİZ =====");
        System.out.println("Lütfen alışveriş işleminiz için seçim yapınız : ");
        System.out.println("[1] Manav Ürünleri");
        System.out.println("[2] Şarküteri Ürünleri");
        System.out.println("[3] Market Ürünleri");
        System.out.println("[4] Fiş Yazdırma");
        System.out.println("[5] Çıkış");

        int secim = scanner.nextInt();

        if (!(secim >= 1 && secim <= 5)) {
            System.out.println("Yanlış giriş yaptınız, lütfen tekrar deneyiniz : ");
            girisEkrani();
        } else {

            switch (secim) {
                case 1:
                    manav();
                    break;
                case 2:
                    sarkuteri();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }
    }

    private static void manav() {
        String[] manavMalzemeleri = {"Elma", "Armut", "Muz"};
        double[] manavFiyatlari = {25, 40, 60};
        int[] manavStok = {6, 8, 5};

        System.out.println("=== MANAV ===");
        System.out.println("Ürünler :");
        for (int i = 0; i < manavMalzemeleri.length; i++) {
            System.out.println("[" + (i + 1) + "] " + manavMalzemeleri[i] + " ==> " + manavFiyatlari[i] + " TL - Stok: " + manavStok[i]);
        }

        System.out.println("Lütfen seçim yapınız (1-" + manavMalzemeleri.length + "): ");
        int secim = scanner.nextInt();

        if (secim < 1 || secim > manavMalzemeleri.length) {
            System.out.println("Seçiminiz geçersizdir, lütfen tekrar seçim yapınız :");
            manav();
        } else {
            secim--;
            System.out.println("Kaç kilo " + manavMalzemeleri[secim] + " almak istersiniz?");
            double kilo = scanner.nextDouble();
            double toplamTutar = manavFiyatlari[secim] * kilo;
            if (manavStok[secim] < kilo) {
                System.out.println("Maalesef, yeterli stok bulunmamaktadır! ");
            } else {
                manavStok[secim] -= kilo;
                toplamTutar -= toplamTutar * kartIndirimOrani;
                toplamFiyat += toplamTutar;
                System.out.println("Harcama toplamınız : " + toplamTutar + " TL'dir");
            }
        }
        girisEkrani();
    }

    private static void sarkuteri() {
        String[] sarkuteriMalzemeleri = {"Peynir", "Zeytin", "Salça"};
        double[] sarkuteriFiyatlari = {150, 100, 50};
        int[] sarkuteriStok = {5, 7, 10};

        System.out.println("=== ŞARKÜTERİ ===");
        System.out.println("Ürünler :");
        for (int i = 0; i < sarkuteriMalzemeleri.length; i++) {
            System.out.println("[" + (i + 1) + "] " + sarkuteriMalzemeleri[i] + " ==> " + sarkuteriFiyatlari[i] + " TL - Stok: " + sarkuteriStok[i]);
        }

        System.out.println("Lütfen seçim yapınız  (1-" + sarkuteriMalzemeleri.length + "): ");
        int secim = scanner.nextInt();

        if (secim < 1 || secim > sarkuteriMalzemeleri.length) {
            System.out.println("Seçiminiz geçersizdir, lütfen tekrar seçim yapınız :");
            sarkuteri();
        } else {
            secim--;
            System.out.println("Kaç adet " + sarkuteriMalzemeleri[secim] + " almak istersiniz?");
            int adet = scanner.nextInt();
            double toplamTutar = sarkuteriFiyatlari[secim] * adet;
            if (sarkuteriStok[secim] < adet) {
                System.out.println("Maalesef, yeterli stok bulunmamaktadır!");
            } else {
                sarkuteriStok[secim] -= adet;
                toplamTutar -= toplamTutar * kartIndirimOrani;
                toplamFiyat += toplamTutar;
                System.out.println("Harcama toplamınız : " + toplamTutar + " TL'dir");
            }
        }
        girisEkrani();
    }

    private static void market() {
        String[] marketMalzemeleri = {"Süt", "Un", "Şeker"};
        double[] marketFiyatlari = {30, 50, 100};
        int[] marketStok = {15, 10, 6};

        System.out.println("=== MARKET ===");
        System.out.println("Malzemeler:");
        for (int i = 0; i < marketMalzemeleri.length; i++) {
            System.out.println("[" + (i + 1) + "] " + marketMalzemeleri[i] + " ==> " + marketFiyatlari[i] + " TL - Stok: " + marketStok[i]);
        }

        System.out.println("Lütfen seçim yapınız  (1-" + marketMalzemeleri.length + "): ");
        int secim = scanner.nextInt();

        if (secim < 1 || secim > marketMalzemeleri.length) {
            System.out.println("Seçiminiz geçersizdir, lütfen tekrar seçim yapınız :");
            market();
        } else {
            secim--;
            System.out.println("Kaç adet " + marketMalzemeleri[secim] + " almak istersiniz?");
            int adet = scanner.nextInt();
            double toplamTutar = marketFiyatlari[secim] * adet;
            if (marketStok[secim] < adet) {
                System.out.println("Maalesef, yeterli stok bulunmamaktadır!");
            } else {
                marketStok[secim] -= adet;
                toplamTutar -= toplamTutar * kartIndirimOrani;
                toplamFiyat += toplamTutar;
                System.out.println("Harcama toplamınız : " + toplamTutar + " TL'dir");
            }
        }
        girisEkrani();
    }

    private static void fisYazdir() {
        System.out.println("GelVeAl_Kart sahibi misiniz, lütfen seçim yapınız : ");
        System.out.println("[1] Evet");
        System.out.println("[2] Hayır");
        int kartVarMi = scanner.nextInt();

        if (kartVarMi == 1) {
            double indirimliTutar = toplamFiyat - (toplamFiyat * kartIndirimOrani);
            System.out.println("Fişiniz yazdırılıyor, lütfen bekleyiniz!..");
            System.out.println("GelVeAl_Kart indirimli harcama toplamınız : " + indirimliTutar + " TL' dir.");
        } else {
            System.out.println("Fişiniz yazdırılıyor, lütfen bekleyiniz!..");
            System.out.println("Harcama toplamınız : " + toplamFiyat + " TL'dir.");
        }
        toplamFiyat = 0;
        girisEkrani();
    }

    private static void cikis() {
        System.out.println("Bizi tercih ettiğiniz için çok teşekkür eder, yine bekleriz !");

    }

}
