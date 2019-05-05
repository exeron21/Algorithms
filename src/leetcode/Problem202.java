package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 202. Happy Number
 * Easy
 *
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 *
 * Example:
 *
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class Problem202 {
    public static void main(String[] args) {
        boolean b = new Solution().isHappy(14);
        System.out.println(b);
    }
    static class Solution {
        public boolean isHappy(int n) {
            Set<Integer> lst = new HashSet<>();
            int m = add(n, lst);
            return (m == 1);
        }

        private int add(int n, Set<Integer> lst) {
            System.out.println(n);
            if (n == 1) {
                return 1;
            }
            int m = 0;
            while(n > 0) {
                m += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (lst.contains(m))
                return m;
            lst.add(m);
            return add(m, lst);
        }
    }
}
