package Java8.Defaults;





interface Parent {
    default  void sayHello() {
        System.out.println("Hello");
    }
}

class Child implements Parent {

}
public class MyClass {
    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();
    }
}
