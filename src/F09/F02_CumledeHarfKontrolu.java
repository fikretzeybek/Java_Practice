package F09;

import java.util.Scanner;

public class F02_CumledeHarfKontrolu {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa "harf cumlede kullanilmamis" yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz : ");
        String cumle = scanner.nextLine();
        System.out.println("Lutfen bir harf giriniz : ");
        String harf = scanner.next();
        String[] cumleHarf = cumle.split("");

        int sayac = 0;
        for (String w:cumleHarf
             ) {
            if (w.equalsIgnoreCase(harf)){
                sayac++;
            }
        }
        if (sayac == 0){
            System.out.println("kullanılmamış");
        }else System.out.println(harf+" cumlede "+sayac+" kez kullanılmış");


    }
}
