package F07;

import java.util.Arrays;

public class odev2 {

    public static void main(String[] args) {
         /*
        ÖDEV:
    Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
    olusturun. Eski array’i yeni haliyle kaydedin.
         */

        int[] arr = {12, 25, 36, 48, 25};
        System.out.println("Arr      : " + Arrays.toString(arr));//arr array'i ilk durum
        arr = degerArtirTopla(arr);//yeni array kalıcı olarak arr aray'ine atandı/kaydedildi
        System.out.println("Arr      : " + Arrays.toString(arr));// arr array' i son durum
    }

    public static int[] degerArtirTopla(int[] arr) {//bir integer array alıp değer artırıp toplayıp döndüren method

        for (int i = 0; i < arr.length; i++) {//array'in elemanlarını tek tek alan döngü

            arr[i] = arr[i] + 2;//herbir elemanın degerini 2 artırma
        }

        return arr;
    }
}


