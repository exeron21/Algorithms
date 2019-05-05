package leetcode;

/**
 * 171. Excel Sheet Column Number
 * Easy
 *
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 *
 * Example 1:
 *
 * Input: "A"
 * Output: 1
 *
 * Example 2:
 *
 * Input: "AB"
 * Output: 28
 *
 * Example 3:
 *
 * Input: "ZY"
 * Output: 701
 */

/**
 * hint: 可以看做是一种26进制的表示法
 */
public class Problem171 {
    public static void main(String[] args) {
        int in = new Solution().titleToNumber("AQA");
        System.out.println(in);
    }
    static class Solution {
        public int titleToNumber(String s) {
            if (s == null || "".equals(s)) {
                return 0;
            }
            s = s.toUpperCase();
            int total = 0;
            char[] arr = s.toCharArray();
            int len = s.length();
            for (int i=0;i<len;i++) {
                total += Math.pow(26, len-i-1) * ((int)arr[i] -64);
            }
            return total;
        }
    }
}
