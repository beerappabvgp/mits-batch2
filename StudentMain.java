class Student {
    String name;
    String rollNumber;
    String branch;
    String contact;

    static String collegeName = "MITE";

    public Student(String name, String rollNumber, String branch, String contact) {
        this.name = name;
        this.branch = branch;
        this.rollNumber = rollNumber;
        this.contact = contact;
    }

    public void print() {
        System.out.println("Name of the student is: " + name);
        System.out.println("Brach of the student : " + branch);
        System.out.println("Roll number of student is: " + rollNumber);
        System.out.print("contact of the student is : " + contact);
    }
}


public class StudentMain {
    // datatype name = new datatype()
    public static void main(String[] args) {
        Student s1 = new Student("Ganesha", "78339", "CS", "83737833993");
        Student s2 = new Student("Shiva", "7889", "CS", "788494949");
        // s1.print();
        // s2.print();
        System.out.println(s1.collegeName); // MITE
        System.out.println(s2.collegeName); // MITE
        s2.collegeName = "MITS";
        System.out.println(s1.collegeName); // MITE
        System.out.println(s2.collegeName); // MITE
        System.out.println(Student.collegeName);
    }
}
