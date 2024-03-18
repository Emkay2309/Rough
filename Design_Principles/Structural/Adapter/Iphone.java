package Design_Principles.Structural.Adapter;

public class Iphone {
    private AppleCharger appleCharger;

    public Iphone(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargePhone() {
        appleCharger.charge();
    }
}
