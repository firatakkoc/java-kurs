package examlaryProjects;
import java.util.Scanner;

public class VowelConsonan {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please a alphabet: ");

        char ch = reader.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
        reader.close();
    }   

}
