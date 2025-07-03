public class OperasiMatematika {
    public static void main(String[] args) {

        // operator |  Keterangan
        //    +     |  Penjumlahan
        //    -     |  Pengurangan
        //    *     |  Perkalian
        //    /     |  Pembagian
        //    %     |
        //    Sisa Pembagian

        int a = 200;
        int b = 9 ;

        System.out.println(a + b );
        System.out.println(a - b );
        System.out.println(a * b );
        System.out.println(a / b );
        System.out.println(a % b ); // sisa bagi sisa dari pembagian 22 / 2

        // augmented assigment

        // Operasi Matematika   |    Augmented Assigment
        // a = a + 10           |    a += 10
        // a = a - 10           |    a -= 10
        // a = a * 10           |    a *= 10
        // a = a / 10           |    a /= 10
        // a = a % 10           |    a %= 10

        int c = 200;

        c = c+ 10;
        System.out.println(c);

        c = c- 10;
        System.out.println(c);

        c = c* 10;
        System.out.println(c);

        c = c/ 10;
        System.out.println(c);

        c = c% 10;
        System.out.println(c);

        // Unary Operator

        // Operator  |  Keterangan
        //    ++     |  a = a + 1
        //    --     |  a = a - 1
        //    -      |  Negative
        //    +      |  Positif
        //    !      |  Boolean Kebalikan

        int d = 100;
        int e = -10;

        d++;
        System.out.println(d);
        System.out.println(e);

        d--;
        System.out.println(d);
        System.out.println(!true);









    }
}
