package win.bojack.win.algorithm4.ch01;

public class Test {
    public static void main(String[] args) {
//        System.out.println(120/ 360);
//        System.out.println(Math.PI * 120/ 360);
//        double d = Math.cos(Math.PI * 120 / 360);
//        System.out.println(120.0/360.0 * 2 * Math.PI);
//        System.out.println("d === " + Math.cos(120.0/360.0 * 2 * Math.PI));


//        System.out.println(StdIn.readDouble() > 1e-10);
//        StdOut.printf("%.2f", 123.1231231231231);
//        StdDraw.filledRectangle(0.01,0.01,0.01,0.01);

        double[] x = new double[5];
        double[] y = new double[5];
        x[0] = 12.31;
        x[1] = 42.31;
        x[2] = 22.31;
        x[3] = 12.31;
        x[4] = 67.31;

        y[0] = 1;
        y[1] = 2;
        y[2] = 3;
        y[3] = 4;
        y[4] = 5;


        double dou = E33_Matrix.dotMul(x,y);
        System.out.println(dou);
    }
}
