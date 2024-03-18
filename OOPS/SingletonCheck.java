package OOPS;

public class SingletonCheck {
    static SingletonCheck instance;
    private SingletonCheck() {
    }

    static  SingletonCheck getSingletonInstance() {
        if(instance == null) {
            instance = new SingletonCheck();
        }
        return instance;
    }
}
