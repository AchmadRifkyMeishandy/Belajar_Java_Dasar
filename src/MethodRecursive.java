public class MethodRecursive {
    public static void main(String[] args) {

        /**
         * Recursive Method Adalah kemampuan method memanggil method dirinya sendiri
         * Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method, seperti contohnya kasus factorial
         */
        /**
         * Problem dari penggunaan recursive method adalah jika recursive terlalu dalam atau terlalu banyak
         * nilainya kemungkinan akan terjadi stackoverflow, yaitu error akibat stack method terlalu banyak di java
         * kenpa bisa terjadi ? karena ketika kita memanggil method, java akan menyimpannya dalam stack, jika method
         * tersebut memanggil method lain, maka stack akan menumpuk terus, dan jika terlalu dalam, maka stack akan
         * terlalu besar, dan menyebabkan error stackoverflow
         */

        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
        loop(10);

    }

    // Menggunakan perulangan factorial biasa
    static int factorialLoop(int value) {
        var result = 1;
        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
    }

    // Menggunakan Perulangan method factorialRecursive
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    // Contoh Loop Menggunakan methodrecursive jika terlalu dalam dan error jika SOUT nya terlalu dalam
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("loop " + value);
            loop(value - 1);
        }
    }
}
