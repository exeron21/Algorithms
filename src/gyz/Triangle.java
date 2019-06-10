package gyz;

public class Triangle extends GeometricObject {
    double side1, side2, side3;

    Triangle() {
    }

    Triangle(double a, double b, double c) {
        side1 = a;
        side2 = b;
        side3 = c;
    }

    public double getArea() {
        System.out.print("Calculated by Heron's formula:");
        double sum = (side1 + side2 + side3) / 2;
        return Math.sqrt(sum * (sum - side1) * (sum - side2) * (sum - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
