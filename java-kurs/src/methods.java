import java.util.Scanner;
public class methods {
    public static void hello() { // istedigimiz zaman bunu cagirip kullaniyoruz

        System.out.println("Hallo Leute!");
        System.out.println("Wie geht euch?");
    }

    public static void factorial() { // Burasi bir method olarak tanimlandi. 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = scanner.nextInt();

        int factorial = 1;

        while (i > 0) {
            factorial *= i;
            i--;
        }scanner.close();
        System.out.println("Factorial: " + factorial);


    }
    
    public static void main(String[] args) {
        factorial();
    }
}
