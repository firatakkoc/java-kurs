import java.util.*; 
public class integers {
    public static void main(String[] args) {

        // byte --> short --> int --> long

        int wertA = 4;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        byte wertB = 100;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        
        short wertC = 200;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        
        long wertD = 110;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // dönüstürme

        // short veri tipinden int veri tipine dönsütürme
        short wertj = 1000;
        int werti = (wertj / 2);
        int wertk = wertj;
        System.out.println(wertk + " is of type = " + ((Object)wertk).getClass().getSimpleName());

        // byte
        byte wertf = 100;
        byte abc = (byte) (wertf / 2);
        System.out.println(abc + " is of type = " + ((Object)abc).getClass().getSimpleName());

        short short1 = 100;
        byte byte2 = 2;
        int int3 = 4;
        long long4 = short1 + byte2 + int3;
        // data type ögrenme
        System.out.println(long4 + " is of type = " + ((Object)long4).getClass().getSimpleName());
    }
}
