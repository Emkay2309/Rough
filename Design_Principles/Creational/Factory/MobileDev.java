package Design_Principles.Creational.Factory;

public class MobileDev implements  Employee{
    @Override
    public int salary() {
        System.out.println("This is Mobile Developer");
        return 60000;
    }
}
