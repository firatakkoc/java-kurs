import java.util.Scanner;

public class bodyMassIndex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilonuzu girin: ");
        int kilo = scanner.nextInt();

        System.out.print("Boyunuzu girin: ");
        double boy = scanner.nextDouble();

        double bodyMassIndex = kilo / (boy * boy);
        System.out.println("Vucut Kitle Endeksiniz: " + bodyMassIndex);

        if (bodyMassIndex < 18.5) {
            System.out.println("Zayif");        
        }

        else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
            System.out.println("Normal");
        }
        else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
            System.out.println("Kilolu");
        }
        else {
            System.out.println("Obez");
        }
        scanner.close();
    
    }
}
