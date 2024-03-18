package Design_Principles.Behavioral.Iterator;

public class Main {
    public static void main(String[] args) {
        //This helps us to provide a way to access the elements of an object without exposing its underlying implementation.

        UserManagement userManagement = new UserManagement();

        userManagement.addUser(new User("Mohsin" , 1));
        userManagement.addUser(new User("emkay" , 10));
        userManagement.addUser(new User("Moo" , 12));
        userManagement.addUser(new User("Moh" , 11));

        MyIterator myIterator = userManagement.getIterator();

        while(myIterator.hasNext()) {
            User user = (User) myIterator.next();
            System.out.println(user.getName());
        }

    }
}
