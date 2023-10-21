package F07;

public class f02 {
    public static void main(String[] args) {
        System.out.println(f01.kutle);
        System.out.println(f01.yas);
        //  System.out.println(P01.isim); P01 class'ındaki verilerden sadece static olanlara ulaşabiliriz.

        f01 obje=new f01();
        System.out.println(f01.yas);
        System.out.println(obje.isim);
        System.out.println(obje.soyisim);
        obje.isim="Nevfel";
        obje.soyisim="Deniz";
        System.out.println(obje.soyisim);
        f01 obje2=new f01();
        obje2.isim="Nazime";
        System.out.println(obje2.isim);
        System.out.println(obje.isim);

    }
}