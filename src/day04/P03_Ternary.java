package day04;

import java.util.Scanner;

public class P03_Ternary {
    public static void main(String[] args) {
         /*
1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
"Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin.
 */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz : ");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();

        String eskenarUcgenMi = kenar1 == kenar2 && kenar2 == kenar3 ? "Eskenar ucgendir " : "Eskenar ucgen degildir";
        System.out.println(eskenarUcgenMi);


    }


}
