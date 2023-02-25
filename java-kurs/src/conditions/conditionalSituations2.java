package conditions;
import java.util.Scanner;
public class conditionalSituations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your note: ");
        int note = scanner.nextInt();

        if (note >= 90 ) {
            System.out.println("AA");
        }
        else if (note >= 85 ) {
            System.out.println("BA");
        }
        else if (note >= 80) {   
            System.out.println("BB");
        }        
        else if (note >= 75) {
            System.out.println("CB");
            
        }        
        else if (note >= 70) {
            System.out.println("CC");
            
        }
        else if (note >= 65) {
            System.out.println("DC");
            
        }        
        else if (note >= 60) {
            System.out.println("DD");
            
        }        
        else if (note >= 55) {
            System.out.println("DF");
            
        }

        else {

            System.out.println("---Unsuccessful Score---");
        }
        scanner.close();
        
    }
}

// eger else if yaptiklarimiz hepsi if olsaydi, bir note girdigimizde bütün if lerdeki sonucalari yazdiracakti. if kosulu saglaniyorsa her sekilde sonucu yazdirir. 