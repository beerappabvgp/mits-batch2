class Person {
    String name;
    int age;
    char gender;
    String contact;

    public Person(String name, int age, char gender, String contact) {
        this.age = age;
        this.gender = gender;
        this.contact = contact;
        this.name = name;
    }

    public void print() {
        System.out.println("Age is: " + age);
        System.out.println("Contact is: " + contact);
        System.out.println("name is : " + name);
        System.out.println("gender is: " + gender);
    }
}

class Student extends Person {
    String rollNumber;
    String branch;

    public Student(String rollNumber, String branch, String name, int age, char gender, String contact) {
        super(name, age, gender, contact);
        this.rollNumber = rollNumber;
        this.branch = branch;
    }

    public void print() {
        super.print();
        System.out.println("rollNumber : " + rollNumber);
        System.out.println("branch: " + branch);
    }
}

// class Employee extends Person {

// }

public class Inheritance {
    public static void main(String[] args) {
        Student s1 = new Student("Ganesh", "89090", "CS", 100, 'M', "89930");
        // System.out.println(s1.name);
        s1.print();
    }
}
