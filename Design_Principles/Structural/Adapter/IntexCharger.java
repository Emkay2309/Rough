package Design_Principles.Structural.Adapter;

public class IntexCharger implements  AppleCharger{
    @Override
    public void charge() {
        System.out.println("Charging Iphone with Intex Charger ");
    }
}
