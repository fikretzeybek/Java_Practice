package F07;

import java.util.Arrays;

public class f03 {

    static int[] arr = {12, 25, 36, 48, 25};

    public static void main(String[] args) {

        /*
        ÖDEV:
    Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
    olusturun. Eski array’i yeni haliyle kaydedin.
         */

      int[] arr= degerArtir();

        System.out.println(Arrays.toString(arr));
    }

    public static int[] degerArtir() {

int[] yeniArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i]+ 2;


        }


        return yeniArr;
    }

}