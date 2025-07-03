import java.util.*;

public class  ScannerInput {
    public static void main(String[] args) {

            /*String nama;
            Scanner userInput = new Scanner(System.in);
            System.out.print("Masukka Nama Anda: ");
            nama = userInput.nextLine();
            System.out.println("Nama Anda Adalah " + nama);*/
        int panjang, lebar, luas, tinggi, volume;

        Scanner userInput = new Scanner(System.in);
        System.out.println("==== MENGHTIUNG LUAS PERSEGI PANJANG ==== ");

        System.out.print("Masukkan Nilai panjang: ");
        panjang = userInput.nextInt();
        System.out.print("Masukkan Nilai Lebar: ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Nilai Luas Persegi Panjang: " + luas);

        System.out.println("=== MENGHITUNG VOLUME === ");
        System.out.print("Masukkan Nilai Tinggi: ");
        tinggi = userInput.nextInt();

        volume = luas * tinggi;
        System.out.println("Nilai Volumenya Adalah: " + volume);

    }
}

