package OOPS;

public class calculator {
    public static void main(String[] args) {
        Calculators c1 = new Calculators();
        System.out.println(c1.sum(1,2));
        System.out.println(c1.sum(1,2,3));
        System.out.println(c1.sum((float)1.0,(float)2.0));

    }
}
//function Overloading -- compile time polymorphism
class Calculators {
    int sum(int a , int b) {
        return a+b;
    }
    int sum(int a , int b , int c) {
        return a+b+c;
    }
    float sum(float a , float b) {
        return a+b;
    }
}
