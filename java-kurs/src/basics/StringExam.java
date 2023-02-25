package basics;
public class StringExam {
        public static void main(String[] args) {
            // strings
            String a = "Java\n"; // alt satira alma 
            String b = "Programming\t ";  // bir tab kadar arada bosluk birakiyor.
            String c = "Sprache ";
            String plus = a + b + c;
            System.out.println(plus);
    
            // String ile int, byte, double sayi toplanarak yazdirilabiliyor.
            /* 
             * String a = "Hello";
             * int b = 75;
             * String c = a + b;
             * System.out.println(c);
            */
    
            char chr1 = '?';
            String str1 = ("Hallo, wie geht's" + chr1);
            System.out.println(str1);
    
            String firstName = "Firat";
            String lastName = "Akkoc";
            String fullName = firstName + " " + lastName;
            System.out.println(fullName);
    
            
            // Karsilastirma 
            String name1 = "Cemal";
            String name2 = "Mehmet";
            if(name1.equals(name2)){
                System.out.println("İsimler ayni.");
            } else {
                System.out.println("İsimler farkli.");
            }
    
            String sentence = "hallo welt";
            String upper = sentence.toUpperCase();
            String lower = sentence.toLowerCase();
            System.out.println(upper);
            System.out.println(lower);
            // çıktı: MERHABA DÜNYA
            // çıktı: merhaba dünya
    
            // String --> int dönüstürme 
    
            String numberString = "42";
            int number = Integer.parseInt(numberString);
            System.out.println("Fazit: " + number + " --> Type is: " + ((Object)number).getClass().getSimpleName());
        }
    }
    
    /* 
        String veri tipi, Java programlama dilinde kullanılan bir veri tipidir ve bir dizi karakteri temsil eder. String veri tipi, tek tırnak yerine çift tırnak kullanılarak tanımlanır. Örneğin, "Merhaba dünya!" bir String ifadesidir.
    
        String veri tipi, karakter dizilerini işlemek için kullanılır. Birçok karakteri bir arada depolamak veya işlemek için kullanılabilir. String veri tipi, birleştirme (concatenation), karşılaştırma, alt dize alma (substring), büyütme (uppercase) ve küçültme (lowercase) gibi işlemleri gerçekleştirmek için kullanılabilir.
    
        String veri tipi, diğer veri tiplerine dönüştürülebilir. Örneğin, String veri tipindeki bir sayıyı integer veya double veri tipine dönüştürmek mümkündür.
    
        String veri tipi, immutable (değiştirilemez) bir veri tipidir. Bu, bir String nesnesinin değerinin oluşturulduktan sonra değiştirilemeyeceği anlamına gelir. Örneğin, "Merhaba" bir String nesnesidir ve bu nesnenin "Merhaba Dünya" olarak değiştirilmesi mümkün değildir. Bunun yerine, yeni bir String nesnesi oluşturulması gerekir.
    
        Özetle, String veri tipi Java programlama dilinde kullanılan bir veri tipidir ve bir dizi karakteri temsil eder. String veri tipi, karakter dizilerini işlemek için kullanılır ve birleştirme, karşılaştırma, alt dize alma, büyütme ve küçültme gibi işlemleri gerçekleştirmek için kullanılabilir. String veri tipi immutable bir veri tipidir ve diğer veri tiplerine dönüştürülebilir. 
    */