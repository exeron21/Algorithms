package win.bojack.win.algorithm4.ch01;

public class E33_Matrix {
    public static double dotMul(double[] x , double[] y) {
        double ret = 0.0;
        if (x.length != y.length) {
            System.err.println("向量长度不同，无法计算");
        } else {
            for (int i = 0 ; i<x.length; i++) {
                ret += x[i] * y[i];
            }
        }

        return ret;
    }
    // 向量点乘
    // 矩阵乘
    // 向量乘矩阵
    // 矩阵乘向量
    // 矩阵转置



    public static void main(String[] args) {
        double[] a = new double[3];
        a[0] = 2;
        a[1] = 3;
        a[2] = 1;
        double[] b = new double[3];
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;

        double ret = E33_Matrix.dotMul(a,b);
        System.out.println(ret);
    }
}
