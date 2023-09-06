package OOPS;

public class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathes() {
        System.out.println("breathes");
    }
    public static void main(String[] args) {
        fish a = new fish(4);
        a.swim();
        a.eat();
        System.out.println(a.fins);


    }
}

class fish extends Animal{
        int fins;
        void swim() {
            System.out.println("swims");
        }
        fish(int fins) {
            this.fins = fins;
        }
}
