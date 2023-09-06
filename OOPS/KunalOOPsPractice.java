package OOPS;

public class KunalOOPsPractice {
    public static void main(String[] args) {
        //car
        // car audi = new car();
        // audi.engine = "petrol";
        // audi.price = 10000000;
        // audi.seats = 4;

        //student
        Student Mohsin = new Student();
        Student Adil = new Student();
//        Mohsin.name= "Adil";

//        System.out.println(Mohsin.name);
//        System.out.println(Mohsin.rno);
//        System.out.println(Mohsin.marks);
        Mohsin.greetings("Mohsin",2);
        Adil.greetings("Adil",3);
//        Mohsin.changeName("Nazim khan");
//        Adil.name = "Adil Amin";

        //Mohsin.greetings();

    }
}
class car {
    String engine = "diesel";
    int price;
    int seats = 6;
}

class Student {

    public String name;
    int rno;
    int marks;

    void greetings(String name,int age) {
        System.out.println("Hello! My Name is "+ name +". "+ age);
    }
    void changeName(String newName) {
        this.name = newName;
    }
    //constructor
    Student () {
        this.name = "Mohsin khan";
        this.rno = 1;
        this.marks = 99;
    }

}
