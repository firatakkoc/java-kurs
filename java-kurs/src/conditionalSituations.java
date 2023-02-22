import java.util.Scanner;

public class conditionalSituations {
    public static void main(String[] args) {
        // if yazdigimizda () yandaki kosul saglaniyorsa blogumuz calisiyor. 
        
        // denetleme yapisi
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your Age: ");
        int age = scanner.nextInt();

        if (age < 18) { // kosulu buraya yaziyoruz

            System.out.println("Your age is not suitable...! ");
        }

        // if blogundaki kosul saglanmazsa else blogu calisicak

        else {  // if olmadan else olmaz
            System.out.println("Welcome!");
        }

        scanner.close();





    }
}
