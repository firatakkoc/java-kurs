import java.util.Scanner;

public class doWhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*do-while döngüsü bir işlemi en az bir kez yapmak istediğimizde kullanılır. 
        Döngüde belirtilen koşul yanlış olsa bile, işlem en az bir kez çalıştırılır.*/
    

        int i = 0;
        do {
            System.out.println("i: " + i);
            i++;
        }while (i < 5);

        // verilen sayinin rakamlarinin toplami hesaplma 

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int total = 0;

        do {
            total += number % 10;

            number /= 10;


        }while (number > 0);

        System.out.println("Total: " + total);
    }

        
}



        /*do {
            // işlem(ler)
        } while (koşul);
        */

        // int i = 0;
        // do {
        //     System.out.println(i);
        //     i++;
        // } while (i < 5);

/*
 * Do-while döngüsü, while döngüsünden farklıdır çünkü while döngüsünde koşul önce kontrol edilir 
 * ve işlem yalnızca koşul doğru olduğunda yapılır. 
 * Do-while döngüsünde ise, işlem önce yapılır ve koşul daha sonra kontrol edilir. 
 * Bu nedenle, do-while döngüsü en az bir kez çalıştırılacağından emin olmak için kullanılır.
 */