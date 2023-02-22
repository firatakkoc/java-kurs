import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Eingeben Sie bitte Nummer: ");
        int day = scanner.nextInt();
        
        String dayString;

        switch (day) {
            case 1:
                dayString = "Montag";
                break;
            case 2:
                dayString = "Dienstag";
                break;
            case 3:
                dayString = "Mittwoch";
                break;
            case 4:
                dayString = "Donnerstag";
                break;
            case 5:
                dayString = "Freitag";
                break;
            case 6:
                dayString = "Samstag";
                break;
            case 7:
                dayString = "Sonntag";
                break;
            default:
                dayString = "Ungültiger Tag";
                break;
        }
        scanner.close();

        System.out.println("Der Tag ist: " + dayString);
    }

} 
        
        /*
         * if else if durumlarinda kullanabiliyoruz. 
        
         * break : bir duruma girdikten sonra baska duruma girmek istemiyorsak kullaniyoruz. 
         */

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Islem Numarasi: ");
        // int islem = scanner.nextInt();

        // switch (islem){
        //     case 1:
        //         System.out.println("1. Islem");
        //         break;
        //     case 2:
        //         System.out.println("2. Islem");
        //         break;
        //     case 3:
        //         System.out.println("3. Islem");
        //         break;
        //     case 4:
        //         System.out.println("4. Islem");
        //         break;
        //     default:
        //         System.out.println("Gecersiz Islem");
        //         break;

        // }
        // scanner.close();