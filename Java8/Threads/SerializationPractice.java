package Java8.Threads;

import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) throws IOException {

        FileOutputStream f1 = new FileOutputStream("C:\\Users\\Emkay\\Desktop\\file1.txt");
        ObjectOutputStream os = new ObjectOutputStream(f1);

        Student s = new Student("Mohsin" , 1);

        os.writeObject(s);
    }

}

class Student  implements  Serializable{
    String name;
    int id;
    Student(String name , int id) {
        this.name = name;
        this.id = id;
    }
}


