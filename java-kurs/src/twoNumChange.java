import java.util.Scanner;
public class twoNumChange {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) { //Obje tanimi
            int sayi1;
            int sayi2;

            System.out.print("Birinci Sayi: ");
            sayi1 = scanner.nextInt();

            System.out.print("Ikinci Sayi: ");
            sayi2 = scanner.nextInt();
            System.out.println("Degistirilmeden Önce...");

            System.out.println("Birinci Sayi: " + sayi1 + "\n" + "Ikinci sayi: " + sayi2);
            // verilen degerlerin yerlerini degistiriyoruz.

            int geciciSayi = sayi1;
            sayi1 = sayi2;
            sayi2 = geciciSayi;

            System.out.println("Degistirildikten Sonra...\n" + "Birinci Sayi: " + sayi1 + "\n" + "Ikinci Sayi: " + sayi2);


        

        }
    }
}
