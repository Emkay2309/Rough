package Practice.Design.FactoryPattern;

public class MobileFactory {
    public static Mobile createMobile(String type) {
        if(type.equalsIgnoreCase("android")) {
            return new Android();
        }
        else {
            return new Mac();
        }
    }
}
