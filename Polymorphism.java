class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("Name is :" + name);
        System.out.println("Age is: " + age);
    }
}

class Student extends Person {
    String rollNumber;
    public Student(String rollNumber, String name, int age) {
        super(name, age);
        this.rollNumber = rollNumber;
    }
    public void print() {
        System.out.println("Roll number : " + rollNumber);
    }
}

class Employee extends Person {
    String employeeId;
    public Employee(String employeeId, String name, int age) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public void print() {
        System.out.println("EmployeeId: " + employeeId);
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        int res = add(10, 20);
        int sum = add(10, 30, 20);
        double ans = add(100.00 , 100.00);
        // System.out.println(res);  // 30
        Person s1 = new Student("89999", "Ganesha", 100);
        s1.print();

    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }
}
