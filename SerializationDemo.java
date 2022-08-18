import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student = new Student("Justin", 8.51, 101, true);
        System.out.println("Before Deserialization:");
        student.print();

        // Serialization
        FileOutputStream fileOut = new FileOutputStream("demo.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fileOut);
        oos.writeObject(student);
        oos.close();
        fileOut.close();
        student.regNo = 102;// Changing the static field

        // Deserialization
        FileInputStream fileIn = new FileInputStream("demo.txt");
        ObjectInputStream ois = new ObjectInputStream(fileIn);
        Student deserializedStudent = (Student) ois.readObject();

        System.out.println("\nAfter Deserialization:");
        deserializedStudent.print();
        ois.close();
        fileIn.close();
    }

    class Student implements Serializable {
        String name;
        Double gpa;
        static int regNo;
        transient boolean isHosteller;

        Student(String name, Double gpa, int regNo, boolean isHosteller) {
            this.name = name;
            this.gpa = gpa;
            this.regNo = regNo;
            this.isHosteller = isHosteller;
        }

        public void print() {
            System.out.println("Name" + this.name);
            System.out.println("GPA:" + this.gpa);
            System.out.println("Registration Number:" + this.regNo);
            System.out.println("ls Hosteller:" + this.isHosteller);
        }
    }
}