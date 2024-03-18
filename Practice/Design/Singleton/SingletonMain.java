package Practice.Design.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonPractice s1 = SingletonPractice.getInstance();

        System.out.println(s1);

        SingletonPractice s2 = SingletonPractice.getInstance();
        System.out.println(s2);
    }
}
