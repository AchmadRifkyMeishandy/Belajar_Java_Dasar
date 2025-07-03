public class ForEach {
    public static void main(String[] args) {

        /**
         * ForEach digunakan untuk perulangan array yang lebih simple agar tidak bertele tele
         */

        // Code dibawah tanpa menggunakan ForEach
        String[] array = {
                "Achmad", "Rifky",
                "Shandy", "Keren"
        };

        for (var i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //kode menggunakan ForEach
        System.out.println("Output Dibawah Menggunakan ForEach ");

        for (String name : array)
            System.out.println(name);
    }
}
