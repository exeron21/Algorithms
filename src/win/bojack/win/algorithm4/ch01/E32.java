package win.bojack.win.algorithm4.ch01;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class E32 {

    static class Split {
        double x ;
        double y ;

        Split(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "x == " + x + " ,y == " + y;
        }
    }

    // 输入一个整数N和两个浮点数r,j，将r,j分成N份，然后再输入一系列的浮点数。画出浮点数存在N份之间的数量的直方图
    public static void main(String[] args) {

        System.out.println("输入一个整数:");
//        int N = StdIn.readInt();
        int N = 10;
        System.out.println("输入两个浮点数:");
//        double min = StdIn.readDouble();
        double min = 10.0;
//        double max = StdIn.readDouble();
        double max = 20.0;
        if (min < 0 || max < 0 || min == max) {
            System.out.println("不正确的数值，程序退出");
            System.exit(0);
        }


        if (min > max) {
            double m = min;
            min = max;
            max = m;
        }

        Split[] splits = new Split[N];
        for (int i = 0; i< N;i++) {
            double m = (max - min) / N;
            Split split = new Split(min + i * m, min + (i + 1) * m) ;
            System.out.println(split.toString());
            splits[i] = split;
        }
        int[] count = new int[N];
//        System.out.println("输入想生成的数量：");
        int cou=0;
//        int cou = StdIn.readInt();
//        for (int i =0;i<cou;i++) {
//            double dou = StdRandom.uniform(min ,max);
//            for (int j = 0;j<N;j++) {
//                if (dou >= splits[j].x && dou<splits[j].y) {
//                    count[j] ++;
//                }
//            }
//        }
        double e = StdIn.readDouble();
        while(e > 1e-8) {
            for (int j = 0;j<N;j++) {
                if (e>= splits[j].x && e<splits[j].y) {
                    count[j] ++;
                }
            }

            e = StdIn.readDouble();
            cou++;
        }
        double w = 1.0/N*0.5 -0.001;
        for (int i =0;i<N; i++) {
            System.out.println("count[i] = " + count[i]);
            double x = (double)i/N + w;
            double y = (double)count[i]/cou*0.5;
            double h = (double)count[i]/cou*1.0;
            StdDraw.filledRectangle(x,y,w,h);
        }

    }
}
