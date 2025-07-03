public class MethodParameter {
    public static void main(String[] args) {

        /**
         * Kita bisa mengirim informasi ke method yang ingin kita panggil
         * untuk memanggil method tersebut kita perlu menambahkan parameter atau argument di method yang sudah kita buat
         * cara membuat parameter sama seperti membuat variable
         * parameter ditempatkan didalam kurung () di deklarasi method
         * parameter bisa lebih dari satu, jika lebih dari satu harus dipisah menggunakan tanda koma
         */

        sayHello("Achmad", "Rifky");
        sayHello("Budi", "Kurniawan");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("hello " + firstName + " " + lastName);
    }
}
