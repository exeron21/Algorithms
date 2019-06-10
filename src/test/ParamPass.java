package test;

public class ParamPass {
    static class Circular {
        Circle bottom;
        double height;
        Circular (Circle c ,double h) {
            bottom = c;
            height = h;
        }

        double getVolume() {
            return bottom.getArea() * height/3.0;
        }

        double getBottomRadius() {
            return bottom.getRadius();
        }

        public void setBottomRadius(double r) {
            bottom.setRadius(r);
        }
    }

    static class Circle {
        double radius,area;
        Circle (double r){
            radius = r;
        }

        void setRadius(double r) {
            radius = r;
        }

        double getRadius() {
            return radius;
        }

        double getArea() {
            area = 3.14 * radius * radius;
            return area;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("main 方法中 circle的引用 : " + circle);
        System.out.println("main 方法中 circle的半径 : " + circle.getRadius());
        Circular circular = new Circular(circle, 20);

        System.out.println("circular 圆锥的 bottom引用 : " + circular.bottom);

        System.out.println("圆锥的 bottom半径 : " + circular.getBottomRadius());
//        circle.setRadius(88);
        System.out.println("-----------------------");

        circle = new Circle(20);
        System.out.println("main 方法中 circle的引用 : " + circle);
        System.out.println("main 方法中 circle的半径 : " + circle.getRadius());
        System.out.println("circular 圆锥的 bottom引用 : " + circular.bottom);
        System.out.println("圆锥的 bottom半径 : " + circular.getBottomRadius());

//        System.exit(-1);

        System.out.println("圆锥的 bottom半径 : " + circular.getBottomRadius());
        System.out.println("圆锥的体积： " + circular.getVolume());
        double r = 8888;

        System.out.println("圆锥更改底圆bottom的半径： " + r);

        circular.setBottomRadius(r);
        System.out.println("main 方法中 circle的半径 : " + circle.getRadius());
        System.out.println("圆锥的体积： " + circular.getVolume());
        System.out.println("main 方法中 circle的引用 : " + circle);
        System.out.println("main 方法中 circle的半径 : " + circle.getRadius());

        circle = new Circle(1000);
        System.out.println("main 方法中 circle的半径 : " + circle.getRadius());
        System.out.println("圆锥的体积： " + circular.getVolume());
        System.out.println("main 方法中 circle的引用 : " + circle);
        System.out.println("main 方法中 circle的半径 : " + circle.getRadius());
    }
}
