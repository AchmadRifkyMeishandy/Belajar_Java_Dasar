public class TipeDataBoolean {

    public static void main(String[] args) {

        // tipe data yang menyatakan true dan false atau hanya bisa true dan false

        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);

        // contoh
        System.out.println(" Contoh Hasil Nilai Ujian ");

        int nilaiUjian = 80;
        if (nilaiUjian >= 70) {

        // jika nilai ujian lebih dari 70 maka hasilnya true
        // jika nilai ujian kurang dari 70 maka hasilnya false

            boolean lulus = true;
            System.out.println(lulus);

        }else{
            // else itu ( atau ) wajib karena untuk menentukan kondisi yang ada

            boolean tidakLulus = false;
            System.out.println(tidakLulus);
        }
    }
}
