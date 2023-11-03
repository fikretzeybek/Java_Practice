package F10;

import java.util.Scanner;

public class MauntainArrayFor {

    public static void main(String[] args) {
        // Kullanıcıdan bir dizi elemanlarının girmesini isteyin
        System.out.print("Mountain Array Kontrolü için array elemanlarını aralarına virgül koyarak giriniz: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        // Girilen elemanları virgüllerden ayırın ve integer dizisine dönüştürün
        String[] strArr = str.split(",");
        int[] Arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            Arr[i] = Integer.parseInt(strArr[i]);
            // Örneğin, "1, 2, 3, 4, 5,1" girdisini ["1", "2", "3", "4", "5"] dönüştürür
        }

        // "Mountain Array" olup olmadığını kontrol eden fonksiyonu çağırın
        boolean mountainMi = mountainArrayKontrolEt(Arr);

        // Sonucu ekrana yazdırın
        if (mountainMi) {
            System.out.println("Girilen dizi bir Mountain Array'dir.");
        } else {
            System.out.println("Girilen dizi bir Mountain Array değildir.");
        }
    }

    public static boolean mountainArrayKontrolEt(int[] arr) {
        //referans noktaları,kendimiz beirliyoruz
        int enBuyuk = arr[0];
        int index = 0;
        boolean sonuc = true;

        // Dizi boyutu 3'ten küçükse false döndürün
        if (arr.length < 3) {
            return false;
        }

        // Dizi içinde en büyük değeri(zirve) bulun
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > enBuyuk) {
                enBuyuk = arr[i];
                index = i;//eski index silinir, yeni index bu olur
            }
        }

        // Dizi sol tarafındaki artan elemanları kontrol edin
        for (int i = 0; i < index; i++) {//ilk elemandan başlar enbüyük sayıya kadar devam eder
            if (arr[i] < arr[i + 1]) {
                continue;
            } else {
                sonuc = false;
                break;
            }
        }

        // Dizi sağ tarafındaki azalan elemanları kontrol edin
        if (sonuc) {
            for (int i = index; i < arr.length - 1; i++) {//enbüyük sayıdan başlayıp sona kadar gider
                if (arr[i] > arr[i + 1]) {
                    continue;
                } else {
                    sonuc = false;
                    break;
                }
            }
        }
        return sonuc;
    }
}
