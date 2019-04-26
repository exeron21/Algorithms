package win.bojack.algorithm4.ch01;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class E31 {
    // 输入一个整数N，和一个0-1之间的浮点数P，在一个圆上画等距的N个点，并按照概率P，用灰线连接所有的点

    static class Point {
        double x;
        double y;

        Point (double x, double y) {
            this.x = x;
            this.y = y;
        }
        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }
    }
    public static void main(String[] args) {
        int N = StdIn.readInt();
        double P = StdIn.readDouble();
        double S = 360;
        double radius = 0.5;
        double pr=0.001;
        StdDraw.circle(radius, radius, radius);
        Point[] points = new Point[N];
        StdDraw.setPenColor(Color.RED);
        for (int i = 0;i<N;i++) {
            double m = S/(N) * i;
            double cos = Math.cos(m/S * Math.PI);
            double sin = Math.sin(m/S * Math.PI);
            double x = radius + radius * Math.cos(m/S * 2 * Math.PI);
            double y = radius + radius * Math.sin(m/S * 2 * Math.PI);
            Point p = new Point(x, y);
            points[i] = p;
            StdDraw.filledCircle(x,y,pr);
        }

        StdDraw.setPenColor(Color.gray);
        for (int i = 0; i<N;i++) {
            for (int j =0;j<N&&j!=i;j++) {
                if (StdRandom.bernoulli(P)) {
                    Point p1 = points[i];
                    Point p2 = points[j];
                    StdDraw.line(p1.x,p1.y,p2.x,p2.y);
                }
            }
        }
    }
}
