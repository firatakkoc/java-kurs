package basics;
public class floatanddouble {
    public static void main(String[] args) {
        // Double : 64 Bit - 8 Byte
        // Float : 32 Bit - 4 Byte
        // Otomatik Dönüstürme : int --> float --> double

        // double num1 = 5.25;
        // double num2 = 4.0;
        // double num3 = 4d;
        // double num4 = 4.23d;

        // float numa = (float) 5.0; // dönüstürme islemi
        // float numb = 5f;
        // float numc = 5.2f;

        int num1 = 22 / 7;
        float num2 = 22f / 7f;
        double num3 = 22d / 7d;

        System.out.println("num1: " + num1 + " = This is of type = " + ((Object)num1).getClass().getSimpleName());
        System.out.println("num2: " + num2 + " = This is of type = " + ((Object)num2).getClass().getSimpleName());
        System.out.println("num3: " + num3 + " = This is of type = " + ((Object)num3).getClass().getSimpleName());


    }

}

// Double ve float arasindaki farklar ve benzerliklefa-rotate-180
// Hassasiyet: Double, float'tan daha yüksek bir hassasiyete sahiptir. Double, daha fazla sayıda ondalık basamağı depolayabilir ve daha doğru sonuçlar verir. Float, daha az sayıda ondalık basamağı depolayabilir ve bu nedenle daha az hassas sonuçlar verir.

// Bellek kullanımı: Double, float'tan daha fazla bellek kullanır. Double veri tipi, 8 bayt bellek kullanırken, float veri tipi 4 bayt bellek kullanır. Bu nedenle, double veri tipi daha fazla bellek tüketir.

// Hız: Float veri tipi, double veri tipine göre daha hızlıdır. Float veri tipi, daha az bellek kullanır ve daha az hassas sonuçlar verirken daha hızlı işlemler gerçekleştirir. Bu nedenle, float veri tipi, bellek kullanımı önemliyse veya yeterince hassas sonuçlar gerekmeyen uygulamalarda tercih edilebilir.

// Özetle, double ve float veri tipleri arasındaki ana fark, hassasiyet, bellek kullanımı ve hızdır. Double, daha hassas sonuçlar sağlar ancak daha fazla bellek kullanır ve daha yavaştır. Float, daha az hassas sonuçlar verir, daha az bellek kullanır ve daha hızlıdır.

// Double ve float veri tiplerinin ortak yanları şunlardır:

// Sayısal verileri temsil etmek için kullanılırlar.
// İşaretli (pozitif veya negatif) ve kesirli sayıları temsil etmek için kullanılırlar.
// Her ikisi de Java'nın temel veri tiplerindendir.
// Her ikisi de IEEE 754 standardını takip eder ve virgülden sonraki sayıları ondalık olarak temsil eder.
// Her ikisi de aritmetik işlemlerde kullanılabilirler. Toplama, çıkarma, çarpma ve bölme gibi matematiksel işlemleri gerçekleştirebilirler.
// Her iki veri tipi de varsayılan değerleri vardır. Double varsayılan olarak 0.0, float ise 0.0f olarak tanımlanır.
// Özetle, double ve float veri tipleri sayısal verileri temsil etmek için kullanılır, IEEE 754 standardını takip ederler ve matematiksel işlemlerde kullanılabilirler.