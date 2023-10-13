package F05;

import java.util.Scanner;

public class F01_DoWhileLoop {
    public static void main(String[] args) {


    // Bir kelime isteyip indexi tek sayi olan karakterleri yazdiran bir code create ediniz

    Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz : ");
        String klm = scanner.next();

        int sayac = 0;

        while (sayac <= klm.length()-1){

            if (sayac %2 == 1){

                System.out.println(sayac + ".index : " + klm.charAt(sayac));

            }
            sayac ++;
        }




    }
}
