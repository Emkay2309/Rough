package Design_Principles.Creational.Prototype;

public class Main {
    public static void main(String[] args) {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.111.111");
        networkConnection.loadData();

        System.out.println(networkConnection);

        //we  want new Object
        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
