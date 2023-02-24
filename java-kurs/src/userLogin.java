import java.util.Scanner;
public class userLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int login_try = 3;

        String sys_user_name = "firatakkoc";
        String sys_password = "12345";

        System.out.println("-------------------------");
        System.out.println("Welcome in Login Page");
        System.out.println("-------------------------");

        while (true) {
            System.out.print("username: ");
            String username = scanner.nextLine();            
            System.out.print("password: ");
            String password = scanner.nextLine();

            if (username.equals(sys_user_name) && password.equals(sys_password)) {
                System.out.println("---Welcome---");
                break;
            }
            else if (username.equals(sys_user_name) && !password.equals(sys_password)) {
                System.out.println(" Your Password is incorrect");
                login_try -= 1;

            }            
            else if (!username.equals(sys_user_name) && password.equals(sys_password)) {
                System.out.println(" Your Username is incorrect");
                login_try -= 1;
            }

            else if (!username.equals(sys_user_name) && !password.equals(sys_password)) {
                System.out.println(" Your Username and Password are incorrect");
                login_try -= 1;
            }


            else {
                System.out.println("---You entered incorrectly---");
            }

            if (login_try == 0) {
                System.out.println("***Your trial is over***");
                break;
            }

        }scanner.close();

    }
}
