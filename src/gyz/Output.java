package gyz;

import java.util.Scanner;

public class Output {
    static String a;
    static double b, c, d;
    static boolean e;

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        b = reader.nextDouble();
        c = reader.nextDouble();
        d = reader.nextDouble();
        a = reader.next();
        e = reader.nextBoolean();
        Triangle triangle;

        if (b * b + c * c == d * d) {
            triangle = new RTriangle(b, c);
        } else if (b * b + d * d == c * c) {
            triangle = new RTriangle(b, d);
        } else if (c * c + d * d == b * b) {
            triangle = new RTriangle(c, d);
        } else {
            triangle = new Triangle(b, c, d);
        }
        triangle.setColor(a);
        triangle.setFilled(e);
        System.out.printf("%.2f\n", triangle.getArea());
        System.out.printf("%.2f\n", triangle.getPerimeter());
        System.out.println(triangle.getColor());
        System.out.println(triangle.getFilled());
        reader.close();
    }
}
