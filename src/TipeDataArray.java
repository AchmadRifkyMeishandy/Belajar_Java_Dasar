public class TipeDataArray {
    public static void main(String[] args) {

        // tipe data array adalah sebuah variable yang bisa menyimpan banyak data
        // array adalah kumpulan data dengan tipe yang sama
        // jumlah data array tidak bisa berubah setelah pertama kali dibuat

        String[] stringArray;
        stringArray = new String[3];

        stringArray [0] = "Shandy";
        stringArray [1] = "Naila";
        stringArray [2] = "Lana";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // cara mengganti namanya

        stringArray[0] = "Budi";

        System.out.println(stringArray[0]);

        // array intializer / lebih simple

        int[] arrayInt = {
          10,20,40,60,70,127
        };

        System.out.println(arrayInt[2]);
        System.out.println(arrayInt.length); // .length untuk mengecek panjang array

        long[] arrayLong = {
          1000,2000,3000,4000,5000
        };

        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

        double[] arrayDouble = {
          12.147, 22.127, 10.14, 10.100
        };

        System.out.println(arrayDouble[1]);
        System.out.println(arrayDouble.length);

        float[] arrayFloat = {
          10.10F, 20.20F, 40.40F
        };

        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat.length);

        String[] ArrayString = {
            "Shandy", "Rifky", "Naila"
        };
        System.out.println(ArrayString[1]);

        // kode array didalam array

        String [][] members = {
        {"Achmad", "Rifky"},
        {"Naila","Adzkhia"},
        {"Joko","Adi"}

        };

        System.out.println(members[0][0]);
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[1][1]);
        System.out.println(members[2][0]);
        System.out.println(members[2][1]);

    }
}
