package win.bojack.win.bojack.test;

import static java.lang.Math.abs;

public class Sqrt {

    /**
     * 这个题实际上是高中数学课本-必修3上面的。。
     * 计算机求方根的过程，实际是上求函数的近似解的过程
     * 如：求一个数10的2次方根，实际上是求解y=x^2-10的近似解
     * 过程就是：找出a,b两个值，使得函数的两个值相乘为负数
     * 然后取中点m，找出a,m或者m,b哪个使得函数的值相乘为负数
     * 重复上述操作，直到函数值相差小于误差，a,b的平均数即为sqrt(10)的值
     *
     * @param args
     */
    public static void main(String[] args) {
        double n = 3;
        double d = 0.000000005;
        Sqrt.solution(n, d);
    }

    public static void solution(double n, double d) {
        double a = 1, b = n, tmp = abs(a - b) / 2;
        int c = 0;
        while (abs(a - b) > d) {
            double y1 = a * a - n;
            double y2 = tmp * tmp - n;
            if (y1 * y2 < 0) {
                b = tmp;
            } else {
                a = tmp;
            }
            tmp = (a + b) / 2;
            c ++;
            System.out.println("计算次数： " + c);
            System.out.println(tmp);
        }
        System.out.println(n + "的2次方根是：" + tmp);
    }
}
