package leetcode;

/**
 * 58. Length of Last Word
 * Easy
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 */
public class Problem058 {
    public static void main(String[] args) {
        String s = "Hello world ";
//        String s = "a ";
        int r = new Solution().lengthOfLastWord(s);
        System.out.println(r);
    }
    static class Solution {
        public int lengthOfLastWord(String s) {
            if (s.isEmpty()) {
                return 0;
            }
            int r = 0;
            for (int i = s.length()-1; i>= 0; i--) {
                char c = s.charAt(i);
                if (c == ' ' && r == 0) {
                    continue;
                }
                if (c == ' ') {
                    return r;
                }
                r ++;
            }
            return r;
        }
    }
}
