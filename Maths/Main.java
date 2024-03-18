package Maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;
    String department;
    Person(String name, int age , String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", 30 , "IT"),
                new Person("Alice", 25 , "Testing"),
                new Person("Bob", 35 , "Marketing"),
                new Person("Yogeshwari", 125 , "Marketing"),
                new Person("EmKay", 30 , "CEO")
        );

        // Sorting the list by name using Java Streams and a lambda expression
        List<Person> sortedPeople = people.stream()
                .sorted((p1, p2) -> p2.name.compareTo(p1.name))
                .collect(Collectors.toList());

        Map<String , Double > ans =  people.stream().collect( Collectors.groupingBy(Person :: getDepartment , Collectors.averagingDouble(Person :: getAge) ) );
        ArrayList<Double> ans1 = new ArrayList<>(  ans.values());

        System.out.println(ans1);


        // Printing the sorted list
//        for (Person person : sortedPeople) {
//            System.out.println(person.name + " - " + person.age);
//        }
    }
}
