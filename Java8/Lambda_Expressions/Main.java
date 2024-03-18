package Java8.Lambda_Expressions;

public class Main {
    public static void main(String[] args) {
        Employee employee = new SoftwareEngineer();
        employee.getName();

        /*
        *  Normal Steps
        * 1.  Created a interface
        * 2. Created a class implementing the above interface
        * 3. Created main method  class and creating an instance of the above class
        *
        *
        * Now we will use Lambda exp for shortcut
        *       How :
        *       Functional Interface acts as Data Type
        * */

        Employee emp1 = () -> "value";
        System.out.println(emp1.getName());
    }
}
