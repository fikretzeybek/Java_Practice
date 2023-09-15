package day03;

public class C06_StringManipulation_Aciklama {
    public static void main(String[] args) {

        //str.toUpperCase() => büyük harf yapma / büyük harf yapar ve onu yazdır.
        //str.toLowerCase() => küçük harf yapma / küçük harf yapar ve onu yazdır.
        //str.equals() => Stringelerin case sensitive olarak eşit olup olmadıklarını karşılaştırı
        //                  ve bize boolean dönüş yapar. Büyük küçük harfe duyarlıdır.
        //str.equalsIgnoreCase() => stringlerin küçük veya büyük harfe duyarı olmadan eşitliğini kontrol
        //                          ederek bize boolen sonuç döndürür
        //str.charAt() => metindeki istenilen indexdeki karakteri bize döndürür.
        //
        //str.length() => strindeki metnin karakter sayısını bize döndürür.
        //str.subString() => metinde aramak istediğiniz metin index olarak(subString(5,10)belirtilen metni bize
        //                      döndürür)
        //str.concatenation() => metindeki istediğimiz stringin sonuna başka bir metin ekler
        //str.contains => metinde istenilen stringin olup olmadığını bize boolean olarak döndürür.
        //str.startsWith() => metin istenilen string ile başlayıp başlamadığını bize boolean olarak döndürür
        //str.endsWith() => metin istenilen string ile bitip bitmediğini bize boolean olarak döndürür
        //str.indexOf() => verilen  kelime yada harfin kaçıncı indexte olduğunu bize döndürür.
        //                  eğer verilen indexte istenilen kelime veya harf yoksa bize -1 döndürür.
        //str.lastIndexsOf() => Verilen kelime yada harfin en son hangi indexte bulunduğunu bize söyler
        //str.isEmpty() => verilen bir string boş olup olmadığını boolean olarak bize döndürür.
        //str.isBlank() => bir string in sadece space lerden oluşup oluşmadığını kontrol eder
        //null pointer =>  (String str=null;) daha sonra kullanılmak üzere variable a null değer atanır.
        //str.replace() => bir metnin yerine başka bir metin koymak için kullanırız.
        //str.replaceFirst() => metinde değiştirmek istediğimiz stringin yerine yenisi ile değiştirir
        //str.replaceAll() => tüm metinde değiştirmek istediğimiz alanları değiştir.
        //                  replaceFirst ve replaceAll da regex kullanımına göre hareket edebiliriz
        //                  örn: \\D digit olmayan herşeyi siler
        //                  örn: \\W Harf veya rakam olmayan herşeyi siler
        //str.repeat()=> verilen stringi istenilen kadar tekrar eder str.repeat(4)
        //str.trim()=> string'in spaceden oluşup oluşmadığını kontrol eder.
    }
}
