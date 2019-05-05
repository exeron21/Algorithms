package leetcode;

/**
 * 168. Excel Sheet Column Title
 * Easy
 * <p>
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * <p>
 * For example:
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * ...
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: "A"
 * <p>
 * Example 2:
 * <p>
 * Input: 28
 * Output: "AB"
 * <p>
 * Example 3:
 * <p>
 * Input: 701
 * Output: "ZY"
 */
public class Problem168 {
    public static void main(String[] args) {
        String s = new Solution().convertToTitle(701);
        System.out.println(s);
    }

    static class Solution {
        public String convertToTitle(int n) {
            if (n <= 0) return "";
            StringBuilder str = new StringBuilder();
            while (n > 0) {
                n--;
                str.append((char) ('A' + n % 26));
                n /= 26;
            }
            return str.reverse().toString();
        }
    }
}
