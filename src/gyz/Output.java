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

        boolean isRTriangle = false;

        if (b * b + c * c == d * d || b * b + d * d == c * c || c * c + d * d == b * b) {
            isRTriangle = true;
        }
        if (isRTriangle)
            triangle = new RTriangle(b, c);
        else
            triangle = new Triangle(b, c, d);

        triangle.setColor(a);
        triangle.setFilled(e);
        System.out.printf("%.2f\n", triangle.getArea());
        System.out.printf("%.2f\n", triangle.getPerimeter());
        System.out.println(triangle.getColor());
        System.out.println(triangle.getFilled());
        reader.close();
    }
}
