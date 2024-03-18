package Design_Principles.Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream = new ChocoCone(
                                new OrangeCone());
        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}
