//Inheritence -- parent class to child class or sub class -- inheriting the properties,methods and behaviors of parent class -- results in reusability of code.
//Types of inheritence: 
//1. Single inheritence : "A derived class can have only one parent class".
//2. MultiLevel inheritence : "A derived class can have more than one parent class".
//3. Hierarchical inheritence : : Two or more Derive class can be inherited from single parent class.
//4. Hybrid inheritence : "It is combination of multiple inheritence and Hierarchical inheritence".
//5. Multiple ineritence : possible by usin interface keyword -- in abstraction topic

// Parent class-- Base class
class Shape {

    String color;
}

// Child class -- Derived class or Sub class
class Triangle extends Shape {

}

public class Inheritence {

    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
