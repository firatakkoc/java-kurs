package examlaryProjects;
import java.util.Scanner;

public class enteredByTheUser {
    public static void main(String[] args) {
        
        // Creats a reader instance which takes
        // input from standar input - keybord

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        //println() prints the following line to the output screen
        System.out.println("You entered: " + number);

        reader.close();
    }
}