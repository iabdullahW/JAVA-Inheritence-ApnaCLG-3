// 2. Multilevel Inheritance: "A derived class can inherit from a parent class, which in turn inherits from another parent class."
// In multilevel inheritance, a class inherits from a class that is already a subclass of another class
class Shape {

    void area() {
        System.out.println("Displays Area ");
    }

}

class Triangle extends Shape {

    void area(int l, int h) {
        System.out.println("Area of Triangle is: " + (1 / 2 * l * h));
    }
}

class EquilateralTriangle extends Triangle {

    void area(int l, int h) {
        System.out.println("Area of Triangle is: " + (1 / 2 * l * h));
    }
}

public class MultiLevel {

    public static void main(String[] args) {

        EquilateralTriangle t1 = new EquilateralTriangle();
        t1.area(10, 5);
    }
}
