package examlaryProjects;
import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilonuzu girin: ");
        int kilo = scanner.nextInt();

        System.out.print("Boyunuzu girin: ");
        double boy = scanner.nextDouble();

        double bodyMassIndex = kilo / (boy * boy);
        System.out.println("Vucut Kitle Endeksiniz: " + bodyMassIndex);

        scanner.close();
    


    }
}
