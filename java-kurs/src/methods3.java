public class methods3 {
    /*
     * "return" anahtar kelimesi, bir metottan bir değer döndürmek için kullanılır. Bir metot, belirli bir işlevi yerine getiren bir kod bloğudur ve bir sonuç döndürmesi gerektiğinde "return" anahtar kelimesi kullanılır.
        public int topla(int sayi1, int sayi2) {
        int sonuc = sayi1 + sayi2;
        return sonuc;
        }
        Bu metot, "sayi1" ve "sayi2" adlı iki tamsayı parametresi alır ve bu sayıların toplamını "sonuc" adlı bir değişkende hesaplar. Daha sonra, "return" anahtar kelimesi kullanarak "sonuc" değişkenindeki değeri döndürür.
        "return" anahtar kelimesi, aynı zamanda bir metot çalıştığı sırada hata oluşursa metot çalışmasını sonlandırmak için de kullanılabilir. Böylece, hata oluştuğunda geriye bir değer döndürülmeden metot sonlandırılır.
        Cikan sonucu baska yerde kullanmak istiyorsak return kullanmamiz lazim.
        */
    
    // public static int plus(int a, int b, int c) {
    //     return (a+b+c);  // Sayisal degerler icin return sart. 
    // }

    // public static void main(String[] args) {
        
    //     System.out.println("and: " + plus(1,2,3));
    // }

    public static int twomultipl(int a) {
        return a * 2; // return en son kelimedir. break gibidir. 
    }
    public static int twoplus(int a) {
        return a + 2;

    }
    public static int formultipl(int a) {
        return a * 4;

    }

    public static void main(String[] args) {
        
        System.out.println("and: " + formultipl(twoplus(twomultipl(8))));

    }
    
}
