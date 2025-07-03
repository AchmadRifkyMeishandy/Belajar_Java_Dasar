public class MethodOverloading {
    public static void main(String[] args) {

        /**
         * Method Overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali
         * Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda beda, entah jumlah atau tipe data parameternya
         * jika ada yang sama, maka program java akan error
         */

        sayHello();
        sayHello("Ucul");
        sayHello("Shandy", "Ganteng");

    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
