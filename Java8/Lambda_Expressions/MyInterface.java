package Java8.Lambda_Expressions;


@FunctionalInterface
public interface MyInterface {
    public void sayHello();

    default void sayBye() {
    };

    static void sayOk(){
    };

}
