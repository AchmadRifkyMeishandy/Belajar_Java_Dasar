public class IfStatement {

    public static void main(String[] args) {

        /* - dalam java,  if adalah salah satu kata kunci yang digunakan untuk percabangan
           - percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu program terpenuhi
         */

        // kode if statement
        var nilai = 70;
        var absen = 80;

        if (nilai >= 75 && absen >= 80) {
            System.out.println("Selamat Anda Lulus ");
        }

        // block else statement, kadang kita ingin melakukan eksekusi program tertentu jika nilai if bernilai true
        else {
            System.out.println("Silahkan Coba Lagi Tahun Depan");
        }

        /* else if statement
           - Kadang Dalam  if, Kita Butuh Membuat Beberapa Kondisi
           - kasus seperti ini kita bisa lakukan di java menggunakan else if expression
           - else if dijava bisa lebih dari satu
         */

        if (nilai >= 80 && absen >= 90) {
            System.out.println("Nilai Anda A ");
        } else if (nilai >= 70 && absen >= 80) {
            System.out.println("Nilai Anda B ");
        } else if (nilai >= 60 && absen >= 70) {
            System.out.println("Nilai Anda C ");
        } else if (nilai >= 50 && absen >= 60) {
            System.out.println("Nilai Anda D ");
        } else {
            System.out.println("Nilai Anda E ");
        }

    }
}