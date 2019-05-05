package leetcode;

/**
 * 258. Add Digits
 * Easy
 *
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 *
 * Example:
 *
 * Input: 38
 * Output: 2
 * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
 *              Since 2 has only one digit, return it.
 *
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */

public class Problem258 {
    public static void main(String[] args) {
        int i= new Solution().addDigits2(0);
        System.out.println(0%9);
        System.out.println(i);
    }
    static class Solution {
        public int addDigits(int num) {
            return add(num);
        }
        //  Every number whose digits sum to a multiple of 9 is divisible by 9.
        public int addDigits2(int num) {
            return (num % 9 == 0 && num != 0) ? 9 : num % 9;
        }

        private int add(int num) {
            if (num < 10) return num;
            int r = 0;
            while (num > 9) {
                int t = num % 10;
                r += t;
                num /= 10;
            }
            r += num;
            return add(r);
        }
    }
}
