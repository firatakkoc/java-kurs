import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        // Switch-Case yapisi ile 4 islem yapan hesap makinesi:
        Scanner scanner = new Scanner(System.in);

        // Burayi neden böyle yaptik?
        String process = "1. Addition\n"
                        +"2. Extraction\n"
                        +"3. Multiplication\n"
                        +"4. Division";
        int a;
        int b;

        System.out.println(process);
        System.out.print("Chose a Process: ");

        String proc = scanner.nextLine();

        switch (proc) {
            case "1":
                System.out.print("First Number: ");
                a = scanner.nextInt();
                System.out.print("Second Number: ");
                b = scanner.nextInt();
                System.out.print("and: " + (a + b));
                break;
            case "2":
                System.out.print("First Number: ");
                a = scanner.nextInt();
                System.out.print("Second Number: ");
                b = scanner.nextInt();
                System.out.print("and: " + (a - b));
                break;
            case "3":
                System.out.print("First Number: ");
                a = scanner.nextInt();
                System.out.print("Second Number: ");
                b = scanner.nextInt();
                System.out.print("and: " + (a * b));
                break;
            case "4":
                System.out.print("First Number: ");
                a = scanner.nextInt();
                System.out.print("Second Number: ");
                b = scanner.nextInt();
                System.out.print("and: " + ((double)a / b));
                break;
            
            default: {
                System.out.println("---Invalid Process---");
            }

        } scanner.close();

    }
}
