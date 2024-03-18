package Design_Principles.Creational.Factory;

public class EmployeeFactory {
    //Get the Employee object that you need
    public static Employee getEmployee(String typeOfEmployee) {
        if(typeOfEmployee.trim().equalsIgnoreCase("webdev")) {
            return new WebDev();
        } else if (typeOfEmployee.trim().equalsIgnoreCase("mobiledev")) {
            return new MobileDev();
        }
        else {
            System.out.println("Not found this type of Employee");
            return null;
        }
    }
}
