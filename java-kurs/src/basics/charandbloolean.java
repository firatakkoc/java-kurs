package basics;
public class charandbloolean {
    public static void main(String[] args) {
        // char
        char chr1 = 'A';
        char chr2 = '?';
        char chr3 = 1000;
        char chr4 = '\u063c'; // Unicode schreiben

        System.out.println(chr1 + System.lineSeparator() + chr2 + System.lineSeparator() + chr3 + System.lineSeparator() + chr4);

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1);
        System.out.println(bool2);

    }
}
/*
    Char, Java programlama dilinde kullanılan bir veri tipidir. Karakterleri tek tek temsil etmek için kullanılır ve 16 bit (2 byte) bellek alanı kullanır. Unicode karakter kodlarını kullanarak, tüm dillerdeki karakterleri temsil etmek için kullanılabilir.

    Char veri tipi, tek tırnak içinde belirtilen bir karakterle tanımlanır. Örneğin, 'a' karakteri char veri tipiyle temsil edilebilir. Aynı şekilde, '\n' (yeni satır) ve '\t' (sekme) gibi özel karakterler de char veri tipiyle temsil edilebilir.

    Char veri tipi, aritmetik işlemlerde kullanılmaz. Bunun yerine, karakterleri depolamak veya işlemek için kullanılır. Karakterlerin bir dizi olarak depolanması için char[] veri tipi kullanılabilir.

    Özetle, char veri tipi Java programlama dilinde kullanılan ve karakterleri tek tek temsil etmek için kullanılan bir veri tipidir. Karakterleri tek tırnak içinde belirtilen karakterlerle tanımlanır ve Unicode karakter kodlarını kullanarak tüm dillerdeki karakterleri temsil edebilir.
 */

/*
    Boolean veri tipi, Java programlama dilinde kullanılan, yalnızca iki farklı değeri alabilen bir veri tipidir: true veya false. Boolean veri tipi, bir şartın doğru veya yanlış olduğunu göstermek için kullanılır. Örneğin, bir ifadenin doğru veya yanlış olduğunu kontrol etmek için kullanılabilir.

    Boolean veri tipi, mantıksal işlemlerde kullanılır. Mantıksal işlemler, iki veya daha fazla şartın birleştirilmesiyle oluşan ifadelerdir. Boolean veri tipi, bu ifadelerin doğru veya yanlış olup olmadığını kontrol etmek için kullanılır.

    Boolean veri tipi, varsayılan olarak false değerine sahiptir. Bir değişkene true değeri atanarak, değişkenin doğru olduğu belirtilir. Örneğin, boolean isTrue = true; ifadesi bir değişkenin true değerine atandığını gösterir.

    Özetle, boolean veri tipi Java programlama dilinde kullanılan, yalnızca iki farklı değeri alabilen bir veri tipidir: true veya false. Boolean veri tipi, şartların doğru veya yanlış olduğunu kontrol etmek için kullanılır ve varsayılan olarak false değerine sahiptir.
 */