//1. Single inheritence : "A derived class can have only one parent class".

class ShapeWithArea {

    void area() {
        System.out.println("Displays Area ");
    }

}

class TriangleWithArea extends ShapeWithArea {

    void area(int l, int h) {
        System.out.println("Area of Triangle is: " + (1 / 2 * l * h));
    }
}

public class SingleInheritence {

    public static void main(String[] args) {
        TriangleWithArea triangle = new TriangleWithArea();
        triangle.area(10, 5); // Outputs area of triangle
    }
}
