package F09;

import java.util.ArrayList;
import java.util.List;

public class F01_ArrayElementleriniKisaltma {

    public static void main(String[] args) {

        /*
         Verilen String bir array'deki her bir elementi kontrol edip,
         - Kelimenin uzunlugu cift sayi ise ilk yarisini
         - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
         yeni bir listeye ekleyip yazdirin.
                                             */

        String[] isimler = {"Mehmet","Deniz","Berivan","Samet","Ömer","Elif","Uğurcan"};
        List<String> yeniList = new ArrayList<>();

        for (String w:isimler
             ) {
           if (w.length() % 2 == 0){
               yeniList.add(w.substring(0,w.length()/2));
           }else {
               yeniList.add(w.substring((w.length()-1)/2));
           }
        }
        System.out.println(yeniList);
    }
}
