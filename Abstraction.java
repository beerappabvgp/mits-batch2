abstract class Shape {
    void draw() {
        System.out.println("Drawing shape .... ");
    }

    abstract void test();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle .... ");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle .... ");
    }
}



public class Abstraction {
    // hiding implementation details and showing only functionality .... 
    
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();

        Shape s2 = new Rectangle();
        s2.draw();
    }

}
