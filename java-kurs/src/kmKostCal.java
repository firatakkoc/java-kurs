import java.util.Scanner;
public class kmKostCal {
    public static void main(String[] args) {

        try (
            // Bir aracin Km' de ne kadar yaktigini ve kac Km yol yaptigini bilgilerini alip ve ne sürücünün toplam ne kadar ödemesi gerektigini hesaplayin. 
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("KM olarak aracini kac cent yakit harciyor?: ");
            double cent = scanner.nextDouble();

            System.out.print("Kac KM gittiniz?: ");
            int km = scanner.nextInt();

            double kost = cent * km;

            System.out.println("Masrafiniz: " + kost + "€");
        }

        
    }

    }
    


    /*try-with-resources Java programlama dilinde bir özelliktir ve try bloğu içinde kullanılan kaynakların otomatik olarak kapatılmasını sağlar. Kaynaklar, örneğin dosya işleme, ağ bağlantıları veya veritabanı bağlantıları gibi kaynaklar olabilir. */