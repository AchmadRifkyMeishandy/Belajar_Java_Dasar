public class Variable {

    public static void main(String[] args) {

        // variable adalah tempat untuk menyimpan data, variable harus sudah ditentukan dari awal
        // variable tidak boleh pakai spasi, enter, tab

        String name;
        name = "Achmad rifky meishandy";

        int age = 19;
        String addres = "Negara : Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(addres);

        // kalau ingin mengganti atau menambah boleh karena program java di running dari atas kebawah

        System.out.println();

        name = "Nayla Adzkhia";
        age = 19;
        addres = "Belanda";

        System.out.println(name);
        System.out.println(age);
        System.out.println(addres);
        System.out.println();

        // kata kunci variable dan lebih simple, tidak perlu menuliskan panjang panjang tipe data nya

        var FirstName = "Achmad Rifky";
        var LastName = "MeiShandy";
        var FullName = FirstName + " " + LastName;
        var Umur = 19;
        var Negara = "Indonesia";
        var Universitas = "Unindra";

        System.out.println(FirstName);
        System.out.println(LastName);
        System.out.println(FullName);
        System.out.println(Umur);
        System.out.println(Negara);
        System.out.println(Universitas);

        // kata kunci final / konstan = tidak bisa berubah lagi value nya setelah di tentukan

        final String Application = "Belajar java";

        // Application = " Belajar php ";  // contoh error

        System.out.println(Application);


    }

}
