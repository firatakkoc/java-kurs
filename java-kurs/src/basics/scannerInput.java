package basics;
import java.util.Scanner;

public class scannerInput {
    public static void main(String[] args) {
        // kullanicidan input alma
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Sayi girin: ");

            int sayi = scanner.nextInt();

            System.out.println("Sayi: " + sayi);

        }

        /* try-with-resources Java programlama dilinde bir özelliktir ve try bloğu içinde kullanılan kaynakların otomatik olarak kapatılmasını sağlar. Kaynaklar, örneğin dosya işleme, ağ bağlantıları veya veritabanı bağlantıları gibi kaynaklar olabilir. */
        
        // System.out.print("Bitte geben Sie Ihr Alter ein: ");
        
        // int alt = scanner.nextInt();

        // System.out.println("Ihr Alter ist: " + alt );

        // System.out.print(" Bitte geben Sie ein Schreibt: ");

        // String schreibt =  scanner.nextLine();
        // System.out.println("Ausgabe: " + schreibt);

        // if (scanner.hasNextInt()) {
        //     int zahl = scanner.nextInt();
        //     System.out.println("Zahl: " + zahl);
            
        // }
        // else {
        //     System.out.println("Lütfen bir sayi giriniz...!");
        // }

        // Scanner ile ilgili bazi önemli bilgiler
        // String name = scanner.nextLine(); // nextline var ise bunu basa yazabiliriz. 
        // int age = scanner.nextInt();
        // //scanner.nextLine(); // Dummy method bunu ekleyebiliz ya da---

        

        // System.out.println("Yas: " + age);
        // System.out.println("Isim: " + name);

    } 
}


/*
    Scanner sınıfı, Java programlama dilinde kullanılan bir sınıftır ve klavyeden, 
    dosyadan veya ağ bağlantılarından gelen verileri okumak için kullanılır.

    Scanner sınıfı, metin tabanlı girdileri kolayca okumamıza olanak tanır. 
    Örneğin, bir kullanıcının klavyeden girdiği metinleri almak için Scanner sınıfı kullanabilirsiniz.

    Scanner sınıfı, birçok farklı veri türünü okumak için kullanılabilir. 
    Örneğin, Scanner sınıfını kullanarak kullanıcının girdiği sayıları, 
    metinleri veya diğer veri türlerini okuyabilirsiniz.

    Scanner sınıfı, Java'nın java.util paketi içinde yer alır ve kullanımı oldukça basittir. 
    Scanner sınıfını kullanmak için, öncelikle sınıfın bir örneğini oluşturmanız gerekir. 
    Daha sonra, Scanner sınıfının sağladığı çeşitli metotları kullanarak girdileri okuyabilirsiniz.
 */