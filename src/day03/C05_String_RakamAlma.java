package day03;

public class C05_String_RakamAlma {
    public static void main(String[] args) {
        String str = "98 sonuç arasından";

        String deger = str.substring(0,2);

        System.out.println(deger);

        System.out.println(deger);

        int sayi1 = Integer.parseInt(deger);

        if (sayi1 > 100) {
            System.out.println("sayı 100 den büyük");
        }
    }
}
