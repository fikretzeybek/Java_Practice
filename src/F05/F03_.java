package F05;

public class F03_ {
    public static void main(String[] args) {

        // iki basamakli sayilardan 7 ile tam bolunebilenleri yazdirin

        int sayi =10;
        String sayilar = "";

        while (sayi < 100){

            if (sayi % 7 == 0){

                sayilar += sayi + ",";

            }
            sayi ++;

        }
        System.out.println(sayilar);
    }
}
