
interface MyInterface {

    void sayHello();
}

class functionalInterface {

    public static void main(String[] args) {

        // Before Java 8
        MyInterface obj1 = new MyInterface() {
            public void sayHello() {
                System.out.println("Hello");
            }
        };
        obj1.sayHello();

        System.out.println("========== Java 8 ==========");

        // Using Lambda
        MyInterface obj2 = () -> System.out.println("Hello");
        obj2.sayHello();
    }
}

// defination :  An interface that contains exactly one abstract method.
// Marked using @FunctionalInterface (optional but recommended)
// Used with Lambda
