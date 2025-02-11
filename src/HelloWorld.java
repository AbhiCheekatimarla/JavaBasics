
interface IHelloWorld {

    void sayHello();
}

class Implementation implements IHelloWorld {

    @java.lang.Override
    public void sayHello() {
        System.out.println("Implementaion in Implementation Class");
    }
}

IHelloWorld imp = () -> System.out.println{"Implemented Using lambda"}