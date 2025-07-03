public class OperasiBoolean {

    public static void main(String[] args) {

        // Operator  |  Keterangan
        //    &&     |  Dan
        //    ||     |  Atau
        //    !      |  Kebalikan

        /* Operasi &&, Operasi ||, Operasi !

           Nilai 1    Operator   Nilai 2    Hasil
           true         &&        true      true
           true         &&        false     false
           false        &&        true      false
           false        &&        false     false

           Nilai 1    Operator   Nilai 2    Hasil
           true         ||        true      true
           true         ||        false     true
           false        ||        true      true
           false        ||        false     false

           Operator   Nilai 2     Hasil
              !        true       false
              !        false      true

         */

    // contoh 1
        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);

     // kenapa false karena nilai absen nya false dan nilai lulus akhir nya true = false, lihat juga operatornya

    // contoh 2

        var kehadiran = 70;
        var ketidakHadiran = 90;

        boolean lulusKehadiran = kehadiran >= 80;
        boolean lulusKetidakHadiran = ketidakHadiran >= 85;

        var naikKelas = lulusKehadiran || lulusKetidakHadiran;
        System.out.println(naikKelas);

    // kenapa true karena nilai hadir nya true dan nilai tidak hadirnya juga true dan lihat juga operator nya


    }
}
