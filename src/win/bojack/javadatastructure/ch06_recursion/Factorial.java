package win.bojack.javadatastructure.ch06_recursion;

/**
 * 计算给定的正整数的阶乘
 */
public class Factorial {
    public static int doTheMath(int i) {
        if (i == 1) {
            return i;
        } else {
            return i * doTheMath(i - 1);
        }
    }


    public static void main(String[] args) {
        int i = 6;
        int x = doTheMath(i);
        System.out.println(i + " 的阶乘是： " + x);
    }
}
