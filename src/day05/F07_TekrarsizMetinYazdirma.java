package day05;

public class F07_TekrarsizMetinYazdirma {

    public static void main(String[] args) {
        String cumle = "Tahmin edemeyecegim bir sonuc ile karsilasacagimi hic dusunmemistim";
        String tekCumle = cumle.toLowerCase().replaceAll(" ", ""); // Cümleyi küçük harfe çevir
        int toplamHarfSayisi = tekCumle.length();

        String tekKelime = "";

        for (int i = 0; i < tekCumle.length(); i++) {

            char harf = tekCumle.charAt(i);

            if (harf >= 'a' && harf <= 'z') {

                if (tekKelime.indexOf(harf) == -1) {

                    tekKelime += harf;

                    System.out.print(harf + ",");

                }

            }

        }
        System.out.println("");
        System.out.println("Tekrarsiz tek kelime  : " + tekKelime);
        System.out.println("Toplam harf sayisi : " + toplamHarfSayisi);
        System.out.println("Tekrarsiz harf sayısı : " + tekKelime.length());
        System.out.println("Cikartilan harf sayısı : " + (toplamHarfSayisi - tekKelime.length()));
    }
}
