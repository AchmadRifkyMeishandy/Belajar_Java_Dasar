public class KonversiTipeDataNumber {

    public static void main(String[] args) {

        // widening casting ( otomatis) dari tipe data terkecil sampai terbesar

        byte varByte = 123;
        short varShort = varByte;
        int varInt = varShort;
        long varLong = varInt;
        float varFloat = varLong;
        double varDouble = varFloat;

        // narrowing casting ( manual ) dari tipe data terbesar sampai terkecil

        float varFloat2 = (float) varDouble;
        long varLong2 = (long) varFloat2;
        int varInt2 = (int) varLong2;
        short varShort2 = (short) varInt2;
        byte varByte2 = (byte) varShort2;

    }
}
