import java.util.Scanner;

public class forLoops2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Faktorial bulma

        System.out.print("Enter a number: ");
        int factorial = 1;
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial *= i;
            System.out.println("factorial: " + factorial + " i = " + i);
        }
        System.out.println("factorial: " + factorial);
        scanner.close();
    }
            
}
