package OOP;

public class ConstructorTest {

    public static void main(String[] args) {

        //Constructor1 account1 = new Constructor1();
        // account1.setAccountNo("123456789");
        // account1.setAccountNo(1000.0);
        // account1.setName("Firat Akkoc");
        // account1.setEmail("firatakkoc@gmail.com");
        // account1.setPhone("1234567890");
    
        // System.out.println("Balance: "+ account1.getBalance());
    
        // ---Constructer Calistirma----

        Constructor1 account1 = new Constructor1("123456789", 1000.0, "Firat Akkoc", "firatakkoc@gmail.com","1234567890" );
    
        account1.manyWithdraw(10000);
    }

}
