public class TernaryOperator {

    public static void main(String[] args) {

        /*- ternary operator adalah operator sederhana dari if statement
         - ternary operator terdiri dari kondisi yang di evaluasi,
         - jika menghasilkan true maka nilai pertama diambil,
         - jika false nilai kedua yang diambil

         */
        var nilai = 80;
        String ucapan;

        if (nilai >= 75){
            ucapan = "Selamat Anda Lulus";
        }else {
            ucapan = "Mohon Maaf Coba Lagi";
        }

        System.out.println(ucapan);

        // contoh menggunakan ternary operator

        {
            var nilai2 = 70;
            String ucapan1 = nilai2 >= 75 ? "Selamat Anda Naik Kelas" : "Mohon Maaf Coba Lagi";
            System.out.println(ucapan1);



        }
    }
}
