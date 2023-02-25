package OOP;

// "Constructors" kelimesinin Türkçe karşılığı "kurucular" veya "yapılandırıcılar"dır.

// Constructor, nesneyi oluşturmak ve başlatmak için kullanılır ve sınıfın özelliklerini ve davranışlarını belirler.

public class Constructor1 {
    private String accountNo;
    private double balance;
    private String name;
    private String e_mail;
    private String phone;
    // Constructor Olusturma 
    public Constructor1(){
        System.out.println("Constructor");
    }

    public Constructor1(String accountNo, double balance, String name, String e_mail, String phone) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.name = name;
        this.e_mail = e_mail;
        this.phone = phone;
    }

    public void manyDeposit(double amount){
        balance += amount;
        System.out.println("New Amount: " + amount);
    }
    public void manyWithdraw(double amount) {
        if (balance > 1500) {
            System.out.println("You can not withdraw more than 1500");
        }
        if ( balance - amount < 0) {
            System.out.println("Not enough balance: " + balance);
        }
        else {
            balance -= amount;
            System.out.println("New Balance: " + balance);
        }
    }

    // accountNo
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getAccountNo() {
        return accountNo;
    }    
    // balance
    public void setAccountNo(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    // name
    public void setName (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    // e_mail
    public void setEmail(String e_mail) {
        this.e_mail = e_mail;
    }
    public String getEmail() {
        return e_mail;
    }
    // phone
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }
}
