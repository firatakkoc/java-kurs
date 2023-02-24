import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * While (döngü kosulu)
         * Kosul dogru oldugu sürece calisir.
         * while döngüsü, koşulun doğru olduğu sürece döngüyü tekrarlar. 
         * Bu döngü yapısı, koşulun döngüden önce veya sonra tanımlanabileceği durumlar için kullanılabilir. while döngüsünde, döngü değişkeni tanımlanmaz ve koşul döngüden önce veya sonra kontrol edilir.
         */
        
        for (int i = 0; i< 5; i++) {
            System.out.println(i);
        }
        
        // int a = 0;
        // while (a < 10) {
        //     System.out.println(a);
        //     a++;
        // }

        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        int factorial = 1;

        while (number > 0) {

            factorial *= number;
            number--;   
        }

        System.out.println("Factorial: " + factorial);
        scanner.close();
    }   

}