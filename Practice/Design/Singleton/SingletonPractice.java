package Practice.Design.Singleton;

public  class SingletonPractice {
    static SingletonPractice instance ;
    //
    private SingletonPractice() {
    }

    //Create a method to create an instance the object
    synchronized static SingletonPractice getInstance() {
        if(instance == null) {
            instance = new SingletonPractice();
        }
        return instance;
    }
}
