
interface MyInterface {

    void show();

    // Java 8 feature
    default void display() {
        System.out.println("Default method");
    }
}

class DefaultMethodInInterface implements MyInterface {

    public void show() {
        System.out.println("Show method");
    }

    public static void main(String[] args) {
        DefaultMethodInInterface t = new DefaultMethodInInterface();
        t.show();
        t.display();
    }
}

// Interface can have method body
//  No need to implement in class
