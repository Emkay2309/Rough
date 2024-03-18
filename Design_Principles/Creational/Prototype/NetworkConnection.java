package Design_Principles.Creational.Prototype;

public class NetworkConnection implements  Cloneable {
    private String ip;
    private String data; //This data takes time to come to client

    public String getIp() {
        return ip;
    }

    public String getData() {
        return data;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void loadData() {
        this.data = "This is very very important data";
        //This takes 5 minutes
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
