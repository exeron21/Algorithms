package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 7. Reverse Integer
 * Easy
 * <p>
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * <p>
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * <p>
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * <p>
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
 * [−2^31,  2^31 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class Problem007 {
    public static void main(String[] args) {
        int so = new Solution().reverse(1534236469 );
        System.out.println(so);
    }

    static class Solution {
        public int reverse(int x) {
            List<Integer> str = new ArrayList<>();
            int sign = 1;
            if (x < 0) {
                sign = -1;
                x *= -1;
            }
            while (x != 0) {
                str.add(x % 10);
                x /= 10;
            }
            long y = 0;
            int len = str.size();
            for (int i = 0; i < len; i++) {
                y += (str.get(i) * Math.pow(10, (len - i - 1)));
            }
            if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) {
                return 0;
            }
            return (int)y * sign;
        }
    }
}
