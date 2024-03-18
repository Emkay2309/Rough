package Mock_Interview_Practice;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        String s = "Hello";
//        System.out.println(s);
//        s.concat("world");
//        System.out.println(s);
//

        Employee e = ()->"software engineer";
        System.out.println(e.getName());

//        Main main = new Main();
//        List<String> list = Arrays.asList("Mohsin" , "Hemanth");
//        list.forEach(Main::print);


        List<Student> school = new ArrayList<>();
        Student s1 = new Student(1,"Mohsin" , 101);
        Student s2 = s1;
        Student s3 = new Student(3,"Hemanth" , 301);
        Student s4 = s3;
        Student s5 = new Student(5,"Min" , 61);
        Student s6 = new Student(6,"Mohn" , 1001);

        school.add(s1);
        school.add(s2);
        school.add(s3);
        school.add(s4);
        school.add(s5);
        school.add(s6);

//        List<Student> a = school.stream().distinct().collect(Collectors.toList());
//        System.out.println(a.size());

        List<Integer> arr = Arrays.asList(1,2,2,6,9,8,7);

        Optional<Integer> ans = arr.stream().reduce((a, b) -> a+b);
        System.out.println(ans);


        List<String> arr2 = Arrays.asList("Mohsin" , "Hemanth");

        IntStream.range(0,arr2.size()/2).forEach(i -> {
            String temp = arr2.get(i);
            arr2.set(i, arr2.get(arr2.size()-i-1));
            arr2.set(arr2.size()-i-1 , temp);
        });

//        System.out.println(arr2);

        HashMap<String , Integer> map = new HashMap<>();
        map.put(null , 1);

        ConcurrentHashMap<String , Integer> map1 = new ConcurrentHashMap<>();

        Thread t = new Thread();

        Emp e1 = new Emp("Mohsin" , 0);
        Emp e2 = new Emp("Yogeshwari" , 4);
        Emp e3 = new Emp("Old Yogeshwari" , 1);
        Emp e4 = new Emp("a" , 2);

        List<Emp> company = new ArrayList<>();
        company.add(e3);
        company.add(e1);
        company.add(e2);
        company.add(e4);


    }
}

class Emp {
    String name;
    int salary;

    public int  getSalary(int sal) {
        return sal;
    }

    Emp(String name , int salary) {
        this.name = name;
        this.salary = salary;
    }
}
class Student {
    int id ;
    String name;
    int roll;
    Student(int id , String name , int roll)  {
        this.id = id;
        this.name = name;
        this.roll = roll;
    }
}
