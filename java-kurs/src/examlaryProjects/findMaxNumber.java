package examlaryProjects;
import java.util.Scanner;

public class findMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int fistNumber = scanner.nextInt();
        System.out.print("Second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Third nummer: ");
        int thirdNumber = scanner.nextInt();

        int maxNumber = -1;

        if (fistNumber >= secondNumber && fistNumber >= thirdNumber) {

            maxNumber = fistNumber;

        }

        else if (secondNumber >= fistNumber && secondNumber >= thirdNumber) {

            maxNumber = secondNumber;
        }

        else {

            maxNumber = thirdNumber;
        }
        scanner.close();

        System.out.println("Max Number is: " + maxNumber);
    }       
}
