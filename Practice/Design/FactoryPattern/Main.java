package Practice.Design.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Mobile oppoF15 = MobileFactory.createMobile("android");


        Mobile iphone12 = MobileFactory.createMobile("mac");
        System.out.println(iphone12);

    }
}
