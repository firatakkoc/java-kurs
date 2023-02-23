public class forLoops {
    public static void main(String[] args) {

        /* for döngüsü, belirli bir aralıkta veya bir koleksiyonun elemanlarında gezinmek için kullanılır. Genellikle, döngüde kaç kez tekrarlanacağı bilinen durumlarda kullanılır. for döngüsünde, döngü değişkeni tanımlanır ve koşul sağlandığı sürece arttırılır veya azaltılır. */
        
        // for (baslatma ; kosul ; arttirma ve azaltma islemleri)

        int i; // degeri döngü baslangicinda tanimliyoruz. 

        for (i = 0; i < 5; i++) {
            System.out.println("i =  " + i);

            /*  eger for icinde degisken atarsak döngü disinda degisken gecerli olmayacak. */
        } 
        System.out.println("----------------------------");

        for (int a = 0; a < 5; a++) {
            System.out.println("a = " + a);
        }
        System.out.println("----------------------------");

        for (int b = 10; b >= 0; b--) {
            System.out.println("b = " + b);
        }
        System.out.println("----------------------------");

        int c = 0;
        for (; c < 5; c++) {  // burada nasil 5 kere yazdirdi?
            System.out.println("I learn Java");
        }
        System.out.println("----------------------------");

        int d = 0;
        int e = 10;
        for (; d < 10 && e > 0; d++,e--) {
            System.out.println("d: " + d);
            System.out.println("e: " + e);
        }
        System.out.println("----------------------------");

        for (int f = 2 ; f < 100; f *= 2 ) {
            System.out.println("f = " + f);
        }
        System.out.println("----------------------------");

    }
}
