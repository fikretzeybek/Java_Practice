package day02;

public class s09 {
    public static void main(String[] args) {

        String str1="Bos mu, Dolu mu?";
        String str2=" ";
        String str3="";

        System.out.println("str1 isBlank :"+ str1.isEmpty());
        System.out.println("str2 isBlank :"+ str2.isEmpty());
        System.out.println("str3 isBlank :"+ str3.isEmpty());


        System.out.println("=============================");

        System.out.println("str1 isBlank :"+ str1.isBlank());
        System.out.println("str2 isBlank :"+ str2.isBlank());
        System.out.println("str3 isBlank :"+ str3.isBlank());

        System.out.println("=============================");

        System.out.println("str1 isBlank :"+ str1.contains(" "));
        System.out.println("str2 isBlank :"+ str2.contains(" "));
        System.out.println("str3 isBlank :"+ str3.contains(" "));


    }
}
