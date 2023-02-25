package basics;
import java.util.Scanner;
public class breakandContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*"break" anahtar kelimesi, döngü veya switch-case yapısının çalışmasını durdurmak için kullanılır. */

        // int i = 0;
        // while (i < 20) {
        //     if ( i == 10) {
        //         break;  // görüldügü an islemi sonlandiriyor.
        //     }
        //     System.out.println("i = " + i);
        //     i++;
        // }

        
        // while(true) {
        //     System.out.print("Enter a number: ");
        //     int a = scanner.nextInt();
        //     if (a == -1){
        //         System.out.println("closed");
        //         break;
        //     }
        //     System.out.println("Process: " + a);
        // }   

        /*"continue" anahtar kelimesi, döngü yapıları içinde kullanıldığında döngünün devam etmesini sağlar ve o anda işlem yapılmamasını sağlar. */

        /*döngüde continue ile karsilasildiginda geri kalan islemleri yapmadan direk döngünün basina geri dönüyor.*/

        // for (int i = 0; i < 10; i++) {
        //     if (i == 3 || i == 5) {
        //         continue;
        //     }
        //     System.out.println("i: " + i );
        // }
        
        int i = 0;

        while (i < 10) {
            if (i == 3 || i == 5) {
                i++;
                continue;
            }
            System.out.println("i : " + i);
            i++;
        }
        scanner.close();

    }
}
