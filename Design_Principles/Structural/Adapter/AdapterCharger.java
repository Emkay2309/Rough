package Design_Principles.Structural.Adapter;

public class AdapterCharger implements AppleCharger {
    private  AndroidCharger charger;
    AdapterCharger(AndroidCharger charger) {
        this.charger = charger;
    }
    @Override
    public void charge() {
        charger.chargeAndroidPhone();
        System.out.println("Charging via Adaptor");
    }
}
