package Questions;

// Parent class Shape
class Shape {
    // Constructor of Shape class
    Shape() {
        System.out.println("Shape constructor called");
    }

    // Method to be overridden by subclasses
    double area() {
        return 0;
    }
}

// Circle class extends Shape
class Circle extends Shape {
    double radius;

    // Constructor of Circle class
    Circle(double radius) {
        super();  // Calling the constructor of the Shape class
        this.radius = radius;
        System.out.println("Circle constructor called");
    }

    // Overriding the area method to calculate area of the circle
    @Override
    double area() {
        return Math.PI * radius * radius;  // Area = π * r^2
    }
}

// Square class extends Shape
class Square extends Shape {
    double side;

    // Constructor of Square class
    Square(double side) {
        super();  // Calling the constructor of the Shape class
        this.side = side;
        System.out.println("Square constructor called");
    }

    // Overriding the area method to calculate area of the square
    @Override
    double area() {
        return side * side;  // Area = side^2
    }
}

// Rectangle class extends Shape
class Rectangle extends Shape {
    double length, width;

    // Constructor of Rectangle class
    Rectangle(double length, double width) {
        super();  // Calling the constructor of the Shape class
        this.length = length;
        this.width = width;
        System.out.println("Rectangle constructor called");
    }

    // Overriding the area method to calculate area of the rectangle
    @Override
    double area() {
        return length * width;  // Area = length * width
    }
}

public class ShapesQues {
    public static void main(String[] args) {
        Circle c = new Circle(5.2);
        c.area();
    }
}
