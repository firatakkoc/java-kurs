import java.util.Scanner;

public class findHipotenus {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int a;
            int b;
            System.out.print("Brinci Kenar: ");
            a = scanner.nextInt();

            System.out.print("Ikinci Kenar: ");
            b = scanner.nextInt();

            //Karekök almak icin (Math.sqrt)
            double h = Math.sqrt(a * a + b * b); 

            System.out.println("Hipotenus: " + h);



        }
    }
}
