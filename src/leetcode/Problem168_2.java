package leetcode;

/**
 * 把数字改为字符串表达方式：(遇J进位)
 * 1->A
 * 2->B
 * 3->C
 * ...
 * 0->J
 * 需要注意的是，单独的0是没有意义的
 */
public class Problem168_2 {

    public static void main(String[] args) {
        byte b = (byte)129;

        //   0001 0000 0001
        //   1111 1111
        System.out.println(b);

        Solution ss = new Solution();

        String s = ss.convertToTitle(11);
        System.out.println(s);
        int re = ss.plus(-123,-19);
        System.out.println(re);
    }

    // 666
    // 789
    //
    //   3 4 5
    // 1 1 1

    // 1 4 5 5
    static class Solution {
        // 0111 0011 计算数7和3
        // 0100 0110
        // 0010 1000
        // 1010 0000
        // 每次a^b得到的是当前位的计算结果，但是不包含进位
        // 每次a&b<<1得到的是应该进的位
        // 因为是二进制，所以可以反复将上一次的计算结果和进位再次计算，得出下次结果与进位
        private int plus(int a , int b) {
            if (b==0) {
                return a;
            } else {
                return plus(a^b, (a&b)<<1);
            }
        }
        public String convertToTitle(int n) {
            if (n <= 0) return "";
            StringBuilder str = new StringBuilder();
            while (n > 0) {
                n--;
                str.append((char) ('A' + n % 10));
                n /= 10;
            }
            return str.reverse().toString();
        }
    }
}
