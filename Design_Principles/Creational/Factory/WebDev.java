package Design_Principles.Creational.Factory;

public class WebDev implements  Employee{
    @Override
    public int salary() {
        System.out.println("This is Web Developer");
        return 90000;
    }
}
