public class MethodVariableArgument {
    public static void main(String[] args) {

        /**
         * kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
         * Biasanya agar bisa seperti ini, Kita akan menggunakan array sebagai parameter di method tersebut
         * Namun dijava, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu, bisa nol atau lebih
         * Parameter dengan tipe data variable argument, hanya bisa ditempatkan di posisi akhir parameter
         */

            int[] values = {80, 80, 80, 80, 80};
        sayCongrats("Achmad", values);

        katakanSelamat("Budi", 20, 20, 20, 20, 20);

    }

    // Code tanpa method Variable Argument
    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf" + name + ", Anda Belum Lulus");
        }
    }

    // Kode menggunakan method Variable Argument
    static void katakanSelamat(String nama, int... nilai1) {
        var total = 0;
        for (var nilai2 : nilai1) {
            total += nilai2;
        }
        var finalValue2 = total / nilai1.length;

        if (finalValue2 >= 75) {
            System.out.println("Selamat " + nama + ", Anda Lulus");
        } else {
            System.out.println("Maaf" + nama + ", Anda Belum Lulus");
        }
    }

}
