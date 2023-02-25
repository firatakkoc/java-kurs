package examlaryProjects;
import java.util.Scanner; 
public class exercise {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your exam score: ");

        int score = scanner.nextInt();

        if (score >= 95) {

            System.out.println("AA");
        }

        else if (score >= 90) {
            System.out.println("AB");
        }
        else if (score >= 85) {
            System.out.println("BA");
        }
        else if (score >= 80) {
            System.out.println("BB");
        }
        else if (score >= 75) {
            System.out.println("BC");
        }
        else if (score >= 70) {
            System.out.println("CA");
        }
        else if (score >= 65) {
            System.out.println("CB");
        }
        else if (score >= 60) {
            System.out.println("CC");
        }
        else if (score >= 55) {
            System.out.println("CD");
        }

        else {
            System.out.println("---You received an invalid grade---");
        }

        scanner.close();
    }
}