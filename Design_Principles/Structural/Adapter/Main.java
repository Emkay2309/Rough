package Design_Principles.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programme Started. . .");


        AppleCharger charger = new IntexCharger();

        Iphone iphone13 = new Iphone(charger);
        iphone13.chargePhone();


        //Imagine not having charger for Iphone . . .Deleting charger for Iphone which is Intex
        AppleCharger charger1 = new AdapterCharger(new IntelCharger());

        Iphone iphone14 = new Iphone(charger1);
        iphone14.chargePhone();

    }
}
