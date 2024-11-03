// Demonstrates Hierarchical Inheritance

class ShapeWithMultipleShapes {
    void area() {
        System.out.println("Displays Area");
    }
}

class TriangleShape extends ShapeWithMultipleShapes {
    void area(int l, int h) {
        System.out.println("Area of Triangle: " + (0.5 * l * h));
    }
}

class CircleShape extends ShapeWithMultipleShapes {
    void area(int r) {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        CircleShape circle = new CircleShape();
        TriangleShape triangle = new TriangleShape();
        
        circle.area(5);         // Outputs area of circle
        triangle.area(10, 5);   // Outputs area of triangle
    }
}
