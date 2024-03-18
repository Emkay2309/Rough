package Practice.Patterns.Singleton;

public class Singleton {
    static  Singleton instance ;
    private Singleton() {
    }

    static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
