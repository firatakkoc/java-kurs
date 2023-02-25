package methods;
public class methods2 {
    public static void hello(String name) {
        
        System.out.println("Hello " + name);
        
    }

    public static void plus(int a, int b, int c) {
        System.out.println("and: " + (a + b + c));
    }
    public static void main(String[] args) {
        hello("Firat");
        plus(3,4,5);
    }
}
