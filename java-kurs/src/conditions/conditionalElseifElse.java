package conditions;
import java.util.Scanner;

public class conditionalElseifElse {
    public static void main(String[] args) {

        // We receive a data from the user...
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Visum: ");
        int visum1 = scanner.nextInt();

        System.out.print("Second Visum: ");
        int visum2 = scanner.nextInt();        
        
        System.out.print("Final: ");
        int finalpoint = scanner.nextInt();

        System.out.print("School avarage: ");
        double avaragepoint = scanner.nextDouble();
        double total = (visum1 * 3 / 10.0) + (visum2 * 3 / 10.0 ) + (finalpoint * 4 / 10.0);

        if (total >= 90) {
            System.out.println("and: AA");
        }        
        else if (total >= 85) {
            System.out.println("and: AB");
        }        
        else if (total >= 80) {
            System.out.println("and: BA");
        }        
        else if (total >= 75) {
            System.out.println("and: BB");
        }        
        else if (total >= 70) {
            System.out.println("and: CB");
        }        
        else if (total >= 65) {
            System.out.println("and: CC");
        }        
        else if (total >= 60) {
            System.out.println("and: DC");

            if (avaragepoint < 2.50) {
                System.out.println("You should take this class again");
            }
        }       
        else if (total >= 55) {
            System.out.println("and: DD");
        }
        else if (total >= 50) {
            System.out.println("and: FF");
        }        
        
        else {
            System.out.println("---stayed this semester---");
        }

        scanner.close();


    }
}
