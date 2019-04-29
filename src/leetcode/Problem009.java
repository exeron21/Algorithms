package leetcode;

/**
 * 9. Palindrome Number
 * Easy
 * <p>
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: 121
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * <p>
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 * Follow up:
 * <p>
 * Could you solve it without converting the integer to a string?
 */
public class Problem009 {
    public static void main(String[] args) {

        boolean f = new Solution().isPalindrome(123321);
        System.out.println(f);
    }

    static class Solution {

        public boolean isPalindrome(int x) {
            if (x < 0) return false;
            String s = Integer.toString(x);
            int i = 0, j = s.length() - 1;
            for (; i < j; i++, j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
            }
            return true;
        }
    }
}
