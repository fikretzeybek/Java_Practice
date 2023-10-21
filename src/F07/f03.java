package F07;

public class f03 {

    static int[] arr = {12, 25, 36, 48, 25};
    static int[] yeniArr;


    public static void main(String[] args) {

        /*
        ÖDEV:
    Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
    olusturun. Eski array’i yeni haliyle kaydedin.
         */
        degerArtir();

    }

    public static int[] degerArtir() {


        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] += 2;

            yeniArr = arr;

        }
        System.out.println(yeniArr);

        return yeniArr;
    }

}