public class logicalOperators {
    public static void main(String[] args) {
        /*
            Mantiksal Operatorler
            && --> and Operator
            Bütün sonuclar kendi icinde true ise genel sonuc true,
            en az birisi bile false ise genel sonuc false.

            || --> or Operator
            Sonuclardan en az birisi bile true ise genel sonuc true,
            false ise genel sonuc false olur.

            ! --> not Operator

         */


            //bir tanesi true ise hepsi true
            System.out.println((3 == 6) && (9 < 8)); 

            // bir tanesi false ise hepsi false
            System.out.println((5 == 9) || (2 < 3));

            // belirli bir sonucu tesine ceviriyor.
            System.out.println(! false);

            System.out.println(!(3 < 4) && ("Firat" == "Firat") || (3.4 > 2.1));


    }
}