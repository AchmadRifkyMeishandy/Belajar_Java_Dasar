public class Scope {
    public static void main(String[] args) {
        sayHello("Rifky");
        /**
         * Di java variable hanya bisa diakses di dalam area dimana mereka dibuat
         * hal ini disebut scope
         * contoh jika sebuah variable dibuat di method, maka hanya bisa diakses di method tersebut,
         * atau jika dibuat dalam block. Maka hanya bisa diakses didalam block tersebut
         */

        sayHello("Shandy");
    }

    static void sayHello(String name) {
        String hello = "Hello " + name;

        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        // System.out.println(hi); , Jika SOUT "hi" itu berada diluar line nya akan terjadi error karena
        // kode tersebut tidak masuk ke dalam line if itu yang dinamakan scope
        // Tetapi SOUT "hello" bisa karena tidak masuk dalam line scope

        System.out.println(hello);
    }
}
