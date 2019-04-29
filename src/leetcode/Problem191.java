package leetcode;

import java.math.BigInteger;

/**
 * 191. Number of 1 Bits
 * Easy
 *
 * Write a function that takes an unsigned integer and return the number of '1' bits it has (also known as the Hamming weight).
 *
 *
 *
 * Example 1:
 *
 * Input: 00000000000000000000000000001011
 * Output: 3
 * Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
 *
 * Example 2:
 *
 * Input: 00000000000000000000000010000000
 * Output: 1
 * Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
 *
 * Example 3:
 *
 * Input: 11111111111111111111111111111101
 * Output: 31
 * Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.
 *
 *
 *
 * Note:
 *
 *     Note that in some languages such as Java, there is no unsigned integer type. In this case, the input will be given as signed integer type and should not affect your implementation, as the internal binary representation of the integer is the same whether it is signed or unsigned.
 *     In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3 above the input represents the signed integer -3.
 *
 *
 *
 * Follow up:
 *
 * If this function is called many times, how would you optimize it?
 */
public class Problem191 {
    public static void main(String[] args) {
        System.out.println(Integer.bitCount(-100));
//        int re = new Solution().hammingWeight(-1238);
//        System.out.println(re);
        int re = new Solution().hammingWeight3(-1238);
        System.out.println(re);
        testForUnsignedShift();
    }

    private static void testForUnsignedShift() {
        int i = -100;
        System.out.println(Integer.toBinaryString(i));
    }

    static class Solution {
        public int hammingWeight(int n) {
            return hammingWeight2(n, 0);
        }

        int hammingWeight2 (int n, int r) {
            if (n == 0) {
                return r;
            }
            r += n & 1;
            // 符号位移，需要再看一下
            return hammingWeight2(n >>> 1, r);
        }

        public int hammingWeight3(int n) {
            int count = 0;
            while (n != 0) {
                count += (1 & n);
                n >>>= 1;
            }
            return count;
        }


        public int hammingWeight1(int n) {
            int m = n;
            while(m>0) {
                System.out.print(m & 1);
                m = m >>1;
            }
            System.out.println("=========");
            String str = Integer.toBinaryString(n);
            System.out.println(str);
            int len = str.length();
            int re = 0;
            for(int i =0;i<len;i++) {
                if (str.charAt(i) == '1') {
                    re ++;
                }
            }
            return re;
        }
    }
}
