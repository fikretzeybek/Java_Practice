package F10;


import java.util.Scanner;

public class MauntainArrayWhile {
    public static void main(String[] args) {
        // Kullanıcıdan dizi elemanlarını girmesini isteyin
        System.out.print("Mountain Array Kontrolü için array elemanlarını aralarına virgül koyarak giriniz: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        // Girilen elemanları virgülle ayırın ve integer dizisine dönüştürün
        String[] strArr = str.split(",");
        int[] Arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            Arr[i] = Integer.parseInt(strArr[i]);
        }

        // Diziye "Mountain Array" olup olmadığını kontrol eden fonksiyonu çağırın ve sonucu ekrana yazdırın
        if (mountainArrayMi(Arr)) {
            System.out.println("Array mountain-array'dir");
        } else {
            System.out.println("Array mountain-array değildir");
        }
    }

    public static boolean mountainArrayMi(int[] arr) {
        int elemanSayisi = arr.length;
        if (elemanSayisi < 3) {
            return false;
        }

        int i = 0;

        // Sol tarafta sürekli artan elemanları kontrol et
        while (i + 1 < elemanSayisi && arr[i] < arr[i + 1]) {
            i++;
        }

        // Zirve noktasını kontrol et
        if (i == 0 || i == elemanSayisi - 1) {
            return false;
        }

        // Sağ tarafta sürekli azalan elemanları kontrol et
        while (i + 1 < elemanSayisi && arr[i] > arr[i + 1]) {
            i++;
        }

        // Dizi sonuna gelinip gelinmediğini kontrol et
        return i == elemanSayisi - 1;
    }
}


