public class basicOperators {
    public static void main(String[] args){
        /*
        + --> 
        - -->
        * -->
        / -->
        % -->  
         */

        System.out.println(3 + 4.2);
        System.out.println(3 - 5f);
        System.out.println(10d / 4);
        System.out.println(3 * 5);
        System.out.println( 10 % 4);

        // Arttirma ve azaltma operatorleri

        // int a = 4;
        // int b = 6;
        // a += 2; 
        // a *= 4;
        // b --; // Postfix yöntemi

        // System.out.println(a);
        // System.out.println(b);

        // Postfix operatörü, değişkenin değerini önce kullanır ve sonra artırır veya azaltır.
        int a = 5;
        int b = a++;  // postfix arttırma operatörü kullanılıyor
        System.out.println(a); // Çıktı: 6
        System.out.println(b); // Çıktı: 5

        // Prefix operatörü, değişkenin değerini önce artırır veya azaltır ve sonra kullanır.
        int c = 5;
        int d = ++c; // prefix arttırma operatörü kullanılıyor
        System.out.println(c); // Çıktı: 6
        System.out.println(d); // Çıktı: 6

        /*
        Java'da, postfix ve prefix gösterimleri bir değişkenin değerini arttırmak veya azaltmak için kullanılan iki farklı operatördür. Postfix operatörü, değişkenin adının sağ tarafına yazılırken, prefix operatörü değişkenin adının sol tarafına yazılır.

         */

    }
}


/*
    Java'da " % " operatörü, modülüs veya kalanı bulmak için kullanılan bir aritmetik operatördür. Bu operatörün sol tarafında bulunan sayının, sağ tarafında bulunan sayıya bölümünden kalanı verir.

    Örneğin, 7 % 3 ifadesi, 7 sayısının 3 sayısına bölümünden kalanı hesaplar ve sonuç olarak 1 döndürür. Bu nedenle, 7'nin 3'e bölünmesi sonucu kalan 1'dir. */

/* Örnek 1: 15 sayısının 4'e bölümünden kalanı hesapla
    int kalan = 15 % 4;
    System.out.println(kalan); // Çıktı: 3

    // Örnek 2: Bir sayının tek mi çift mi olduğunu kontrol etme
    int sayi = 7;
    if(sayi % 2 == 0) {
        System.out.println(sayi + " çift sayıdır.");
    } else {
        System.out.println(sayi + " tek sayıdır.");
    }
    // Çıktı: 7 tek sayıdır. 
*/