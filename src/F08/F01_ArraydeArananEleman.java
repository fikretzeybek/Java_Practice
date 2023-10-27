package F08;

public class F01_ArraydeArananEleman {

    public static void main(String[] args) {

        //Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.

        int [] arr = {2,3,6,12,25,36,27,7,6,38,19,102,36};


        istenenElemaniAra(arr,36);
    }

    private static void istenenElemaniAra(int[] arr, int aranan) {

        int sayac = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == aranan){
                sayac ++;
            }

        }
        if (sayac == 0){
            System.out.println("Aradiginiz " + aranan + " dizide bulunmamaktadir");

        }else {
            System.out.println("Aradiginiz " + aranan + " sayisi dizide vardir ve " + sayac + " kez kullanilmistir");
        }
    }

}
