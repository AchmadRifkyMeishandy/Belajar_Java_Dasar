public class SwitchStatement {
    public static void main(String[] args) {

        /* Switch Statement
           - Kadang Kita Hanya Butuh Menggunakan Kondisi Sederhana di if Statement, seperti
             hanya menggunakan perbandingan ==
           - Switch adalah statement percabangan yang sama dengan if, namun lebih sederhana pembuatannya
           - kondisi di switch statement hanya untuk perbandingan ==
         */

        var nilai = "60";

        switch (nilai) {
            case "90":
                System.out.println("Wow Anda Lulus Dengan Baik ");
                break;
            case "80":
            case "70":
                System.out.println("Nilai Anda Cukup Baik ");
                break;
            case "60":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        var nilai2 = "B";
        switch (nilai2) {
            case "A":
                System.out.println("Anda Lulus Dengan Nilai A");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus Dengan Nilai B");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus Dengan Nilai D");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");

        }

    /* Switch lambda ini lebih mempermudah saat penggunaan switch expression karena
        kita tidak perlu lagi menggunakan kata kunci break
    */
        {
            var nilai3 = "A";
            switch (nilai3) {
                case "A" -> System.out.println("Nilai Anda Bagus Sekali");
                case "B", "C" -> System.out.println("Nilai Anda Baik");
                case "D" -> System.out.println("Anda Tidak Lulus");
                default -> {
                    System.out.println("Mungkin Anda Salah Jurusan");
                }

                // switch dengan yield

            }
            var nilai4 = "E";
            String ucapan = switch (nilai4) {
                case "A":
                    yield "Wow Mantap";
                case "B", "C":
                    yield "Wow Baik";
                case "D":
                    yield "Anda Tidak Lulus";
                default:
                    yield "Mungkin Anda Salah Jurusan";
            };
            System.out.println(ucapan);


        }
    }
}

