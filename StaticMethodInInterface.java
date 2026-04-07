
interface MyInterface {

    static void print() {
        System.out.println("Static method");
    }
}

public class StaticMethodInInterface {

    public static void main(String[] args) {

        // Call using interface name
        MyInterface.print();
    }
}

// Belongs to interface
// Cannot override
