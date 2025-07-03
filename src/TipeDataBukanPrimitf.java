public class TipeDataBukanPrimitf {

    public static void main(String[] args) {

        // tipe data primitif adalah tipe data bawaan di dalam bahasa pemrograman dan tidak bisa diubah lagi
        // tipe data number, char, boolean adalah tipe data primitif selalu memiliki default value
        // tipe data String bukan tipe data primtif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null
        // tipe data bukan primitif bisa memiliki method/function

        // tipe data primif = byte    |  tipe data bukan primitif = Byte
        // tipe data primif = short   |  tipe data bukan primitif = Short
        // tipe data primif = int     |  tipe data bukan primitif = Integer
        // tipe data primif = long    |  tipe data bukan primitif = Long
        // tipe data primif = float   |  tipe data bukan primitif = Float
        // tipe data primif = double  |  tipe data bukan primitif = Double
        // tipe data primif = char    |  tipe data bukan primitif = Character
        // tipe data primif = boolean |  tipe data bukan primitif = Boolean

        Integer iniInteger = 100;
        Long iniLong = 1000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

                // konversi primitif ke bukan primitif

        int iniInt = 10;

        Integer iniIntteger =iniInt;

                // konversi dari bukan primitif ke primitif

        int iniIntAgain = iniInteger;

                // tipe data primitif ke bukan primitif tapi beda tipe data

        byte inibyte = iniInteger.byteValue();
        short inishort = iniIntteger.shortValue();
        long inilong = iniInteger.longValue();

    }

}
