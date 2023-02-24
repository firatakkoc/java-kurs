import java.util.Scanner;
public class atmApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 1000;
        String proc = "1 - See your Amount\n"
                    + "2 - Withdraw money\n"
                    + "3 - Deposit money\n"
                    + "4 - exit with (q)";

        System.out.println("-----------------------------");
        System.out.println(proc);
        System.out.println("-----------------------------");

        while(true) {
            System.out.print("Chose a Process: ");
            String p = scanner.nextLine();

            if (p.equals("q")) {
                System.out.println("closed");
                break;
            }
            else if (p.equals("1")){
                System.out.println("Your Balance: " + balance);
            }
            else if (p.equals("2")) {
                System.out.println("Amount: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                if ( balance - amount <= 0) {
                    System.out.println("insufficient funds\n" + "Your Amount: " + balance);
                }
                else {
                    balance -= amount;
                    System.out.println(" New Balance Your Wallet: " + balance);
                }


            }
            else if (p.equals("3")){
                System.out.println("Deposit Amount: ");
                int depAmount = scanner.nextInt();
                scanner.nextLine();

                balance += depAmount;


            }
            else {
                System.out.println("--invalid transaction--");
            }
        }
        scanner.close();
        
    }
    
}
