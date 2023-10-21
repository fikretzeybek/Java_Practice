package F06;

import java.util.Scanner;

public class MarketProjesi {

    static Scanner scanner = new Scanner(System.in);
    static double kartIndirimOrani = 0.15;
    static double toplamFiyat = 0;

    public static void main(String[] args) {

        girisEkrani();
    }

    private static void girisEkrani() {//Musteri karsılama ekranı
        System.out.println("===== GEL&AL MARKET =====");
        System.out.println("===== HOŞGELDİNİZ =====");
        System.out.println("Lütfen alışveriş işleminiz için seçim yapınız : ");
        System.out.println("[1] Manav Ürünleri");
        System.out.println("[2] Şarküteri Ürünleri");
        System.out.println("[3] Market Ürünleri");
        System.out.println("[4] Fiş Yazdırma");
        System.out.println("[5] Alışverişsiz Çıkış");

        int secim = scanner.nextInt();// Musteri 1 ile 5 (dahil) arasinda secim yapabilmektedir
        //Secim  1 ile 5 (dahil) haricinde girdiginde hata mesaj vermekte ve giris ekranina yonlendirmektedir
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

    private static void manav() {//Manav bolumunun islemleri yapılmaktadir
        String[] manavUrunleri = {"Elma", "Armut", "Muz"};
        double[] manavFiyatlari = {25, 40, 60};
        int[] manavStok = {6, 8, 5};

        System.out.println("=== MANAV BÖLÜMÜ ÜRÜNLERİ===");

        //Manav Bolumu Urunleri, Adi, Fiyati ve Stok Durumu gorulebilmektedir
        for (int i = 0; i < manavUrunleri.length; i++) {
            System.out.println("[" + (i + 1) + "] " + manavUrunleri[i] + " ==> " + manavFiyatlari[i] +
                    " TL - Stok: " + manavStok[i]);
        }

        System.out.println("Lütfen seçim yapınız (1-" + manavUrunleri.length + "): ");
        int secim = scanner.nextInt();//Musteri 1 ile Urun Cesidi sayisi araliginda secim yapabilmektedir
        if (secim < 1 || secim > manavUrunleri.length) {//Hatali secim ayiklanmaktadir
            System.out.println("Seçiminiz geçersizdir, lütfen tekrar seçim yapınız :");
            manav();//Musteri hatali secim sonrasi Manav Bolumune dondurulmektedir
        } else {
            //Musterinin secimini 0' dan 1'den baslattigimiz icin,
            //azaltma yontemi ile secim ile urunlerin index'leri esitlenmektedir
            secim--;
            System.out.println("Kaç kilo " + manavUrunleri[secim] + " almak istersiniz?");
            double kilo = scanner.nextDouble();
            if (manavStok[secim] < kilo) {//Secilen urun miktari ile stok miktari karsilastirilmaktadir
                //Secim miktari stok miktarini asmasi halinde mesaj verilmekte ve Manav Bolumune dondurulmektedir
                System.out.println("Maalesef yeterli stok bulunmamaktadır, tekrar secim yapınız.. ");
                manav();
            } else {//Musterinin secim miktari kadar rakam stoktan dusulmektedir
                manavStok[secim] -= kilo;
            }
            //Manav bolumune ait toplam harcamalar toplamFiyat' a aktarilmaktadir
            toplamFiyat += manavFiyatlari[secim] * kilo;
            System.out.println("Harcama tutariniz : " + toplamFiyat);//Harcama miktari gorulebilmektedir
        }
        //Musterinin alisverise devam edip etmeyecegi sorulmaktadir
        System.out.println("Alışverişe devam etmek istiyor musunuz ? ");
        System.out.println("[1] Evet");
        System.out.println("[2] Hayır");
        int devamMi = scanner.nextInt();
        //Alisverise devam edilecek ise girisgirisEkrani()' na
        //edilmeyecek ise islemleri tamamlamak uzere  fisYazdir()'a yonlendirilmektedir
        if (devamMi == 1) {
            girisEkrani();
        } else {
            fisYazdir();
        }
    }

    //Yukarida yapilan aciklamalar Sarkuteri Bolumu icin de gecerlidir
    private static void sarkuteri() {
        String[] sarkuteriUrunleri = {"Peynir", "Zeytin", "Salça"};
        double[] sarkuteriFiyatlari = {150, 100, 50};
        int[] sarkuteriStok = {5, 7, 10};

        System.out.println("=== ŞARKÜTERİ BÖLÜMÜ ÜRÜNLERİ===");

        for (int i = 0; i < sarkuteriUrunleri.length; i++) {
            System.out.println("[" + (i + 1) + "] " + sarkuteriUrunleri[i] + " ==> " + sarkuteriFiyatlari[i] + " TL - Stok: " + sarkuteriStok[i]);
        }

        System.out.println("Lütfen seçim yapınız  (1-" + sarkuteriUrunleri.length + "): ");
        int secim = scanner.nextInt();

        if (secim < 1 || secim > sarkuteriUrunleri.length) {
            System.out.println("Seçiminiz geçersizdir, lütfen tekrar seçim yapınız :");
            sarkuteri();
        } else {
            secim--;
            System.out.println("Kaç adet " + sarkuteriUrunleri[secim] + " almak istersiniz?");
            int adet = scanner.nextInt();
            toplamFiyat += sarkuteriFiyatlari[secim] * adet;
            System.out.println("Harcama tutariniz : " + toplamFiyat);
            if (sarkuteriStok[secim] < adet) {
                System.out.println("Maalesef yeterli stok bulunmamaktadır, tekrar secim yapınız..");
                sarkuteri();
            } else {
                sarkuteriStok[secim] -= adet;
            }
        }
        System.out.println("Alışverişe devam etmek istiyor musunuz ? ");
        System.out.println("[1] Evet");
        System.out.println("[2] Hayır");
        int devamMi = scanner.nextInt();
        if (devamMi == 1) {
            girisEkrani();
        } else {
            fisYazdir();
        }
    }

    //Yukarida yapilan aciklamalar Market Bolumu icin de gecerlidir
    private static void market() {
        String[] marketUrunleri = {"Süt", "Un", "Şeker"};
        double[] marketFiyatlari = {30, 50, 100};
        int[] marketStok = {15, 10, 6};

        System.out.println("=== MARKET BÖLÜMÜ ÜRÜNLERİ===");

        for (int i = 0; i < marketUrunleri.length; i++) {
            System.out.println("[" + (i + 1) + "] " + marketUrunleri[i] + " ==> " + marketFiyatlari[i] + " TL - Stok: " + marketStok[i]);
        }

        System.out.println("Lütfen seçim yapınız  (1-" + marketUrunleri.length + "): ");
        int secim = scanner.nextInt();

        if (secim < 1 || secim > marketUrunleri.length) {
            System.out.println("Seçiminiz geçersizdir, lütfen tekrar seçim yapınız :");
            market();
        } else {
            secim--;
            System.out.println("Kaç adet " + marketUrunleri[secim] + " almak istersiniz?");
            int adet = scanner.nextInt();
            toplamFiyat += marketFiyatlari[secim] * adet;
            System.out.println("Harcama tutariniz : " + toplamFiyat);
            if (marketStok[secim] < adet) {
                System.out.println("Maalesef yeterli stok bulunmamaktadır, tekrar secim yapınız..");
                market();
            } else {
                marketStok[secim] -= adet;
            }
        }
        System.out.println("Alışverişe devam etmek istiyor musunuz ? ");
        System.out.println("[1] Evet");
        System.out.println("[2] Hayır");
        int devamMi = scanner.nextInt();
        if (devamMi == 1) {
            girisEkrani();
        } else {
            fisYazdir();
        }

    }

    //Toplam harcama, Gel&Al_Kart indirimli toplam harcama ve fis yazdirma islemleri yapilmaktadir
    private static void fisYazdir() {
        System.out.println("Gel&Al_Kart sahibi misiniz, lütfen seçim yapınız : ");
        System.out.println("[1] Evet");
        System.out.println("[2] Hayır");
        int kartVarMi = scanner.nextInt();

        if (kartVarMi == 1) {//Gel&Al_Kart sahiplerine %15 indirim uygulanarak fis yazdirilmakta ve
                             //iyi gunler dilenmektedir
            double indirimliTutar = toplamFiyat - (toplamFiyat * kartIndirimOrani);
            System.out.println("Fişiniz yazdırılıyor, lütfen bekleyiniz!..");
            System.out.println("Gel&Al_Kart indirimli harcama toplamınız : " + indirimliTutar + " TL' dir.");
            System.out.println("Bizi tercih ettiğiniz için çok teşekkür eder, yine bekleriz :)");

        } else {//Toplam harcama miktarinca fis yazdirilmakta ve iyi gunler dilenmektedir
            System.out.println("Fişiniz yazdırılıyor, lütfen bekleyiniz!..");
            System.out.println("Harcama toplamınız : " + toplamFiyat + " TL'dir.");
            System.out.println("Bizi tercih ettiğiniz için çok teşekkür eder, yine bekleriz :)");
        }

    }
    private static void cikis() {//Musteri karsilama ekraninda alisveristen vazgecme secenegi sunulmaktadir
        System.out.println("Yine bekleriz, iyi günler :)");
    }

}
