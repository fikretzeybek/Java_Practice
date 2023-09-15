package day02;

public class d02_ {
    public static void main(String[] args) {
        String str = "Java code yaz";

        System.out.println(str.substring(5));
        //Ekrana ode yaz yazdirir.

        System.out.println(str.substring(12));
        //Ekrana z yazdirir.

        System.out.println(str.substring(5, 9));
        //Ekrana code yazdirir.

        System.out.println(str.substring(8, 8));
        //Ekranda hicbirsey goremezsiniz.

        System.out.println("===========");

        String text = "Can, Cananlara gitmek icin can atiyor";

        System.out.println(text.replace("Can", "Turk"));

    }
}
