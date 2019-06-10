package leetcode;

import edu.princeton.cs.algs4.StdOut;

import java.util.HashMap;
import java.util.Map;

/**
 * p70 爬梯子
 * p509 fibonacci数列
 * <p>
 * 注意梯子级数从1开始，stairs(1)=1,stairs(2)=2,stairs(3)=3
 * 数列从0开始，fib(0)=0,fib(1)=1,fib(2)=1
 */
public class P70_509 {

    public static void main(String[] args) {
        Solution so = new Solution();
        int i = so.climbStairs(20);
        System.out.println(i);
        int j = so.climbStairs2(20);
        System.out.println(j);

        int sum = so.fib(20);
        System.out.println(sum);

        int sum1 = so.fib(21);
        System.out.println(sum1);
    }

    static class Solution {
        Map<Integer, Integer> map = new HashMap<>();

        public int climbStairs(int n) {
            map.put(1, 1);
            map.put(2, 2);
            if (n <= 2) return n;
            else return climbStairs1(n - 1) + climbStairs1(n - 2);
        }

        private int climbStairs1(int n) {
            int sum;
            if (map.get(n) != null) {
                return map.get(n);
            } else {
                sum = climbStairs1(n - 1) + climbStairs1(n - 2);
                map.put(n, sum);
                return sum;
            }
        }

        private int climbStairs2(int n) {
            int a1 = 1;
            int a2 = 2;
            int tmp = 0;
            for (int i = 3; i <= n; i++) {
                tmp = a1 + a2;
                a1 = a2;
                a2 = tmp;
            }
            return tmp;
        }

        private int fib2 (int n) {
            int i0 = 0;
            int i1 = 1;
            int sum = 0;
            for (int i = 2; i<=n; i++) {
                sum = i0 + i1;
                i0 = i1;
                i1 = sum;
            }
            return sum;
        }

        private int fib(int n) {
            int i0 = 0;
            int i1 = 1;
            int sum = 0;
            for (int i = 2; i <= n; i++) {
                sum = i0 + i1;
                i0 = i1;
                i1 = sum;
            }
            return sum;
        }
    }
}
