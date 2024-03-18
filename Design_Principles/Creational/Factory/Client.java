package Design_Principles.Creational.Factory;

public class Client {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee("webdev");
        System.out.println(e1.salary());

        Employee e2 = EmployeeFactory.getEmployee("mobiledev");
        System.out.println(e2.salary());
    }
}
