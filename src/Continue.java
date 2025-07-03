public class Continue {
    public static void main(String[] args) {


        for (var counter = 1; counter <= 100; counter++) {
            // hasil ganjil karena 2 dengan 0
            if(counter % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan Ganjil" + counter);
        }

    }
}
