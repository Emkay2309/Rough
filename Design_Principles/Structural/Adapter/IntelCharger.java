package Design_Principles.Structural.Adapter;

public class IntelCharger implements  AndroidCharger{
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Charging Android Phone with Intel Charger");
    }
}
