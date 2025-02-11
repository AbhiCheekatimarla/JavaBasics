interface IHelloWorld {
    void sayHello();
}

class Implementation implements IHelloWorld {
    @Override
    public void sayHello() {
        System.out.println("Implementation in Implementation Class");
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        // Using traditional class-based implementation
        IHelloWorld obj = new Implementation();
        obj.sayHello();

        // Using lambda expression to implement the interface
        IHelloWorld imp = () -> System.out.println("Implemented Using Lambda");
        imp.sayHello(); // Calling the lambda implementation
    }
}