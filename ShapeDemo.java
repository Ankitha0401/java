abstract class Shape {
    int dim1, dim2;

    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int l, int b) {
        super(l, b);
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (dim1 * dim2));
    }
}

class Triangle extends Shape {
    Triangle(int b, int h) {
        super(b, h);
    }

    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * dim1 * dim2));
    }
}

class Circle extends Shape {
    Circle(int r, int dummy) {
        super(r, dummy);
    }

    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * dim1 * dim1));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(10, 5);
        Shape s2 = new Triangle(8, 6);
        Shape s3 = new Circle(7, 0);

        s1.printArea();
        s2.printArea();
        s3.printArea();
    }
}