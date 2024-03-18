package Design_Principles.Structural.Decorator;

public class OrangeCone implements IceCream {
    private IceCream iceCream;

    public OrangeCone (){
    }
    public OrangeCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        if(iceCream != null) {
            return iceCream.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if(iceCream != null) {
            return iceCream.getDescription() + " Orange Cone";
        }
        return " Orange Cone";
    }
}

