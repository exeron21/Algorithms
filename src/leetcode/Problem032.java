package leetcode;

import java.util.Stack;

/**
 * 32. Longest Valid Parentheses
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
 * <p>
 * Example 1:
 * <p>
 * Input: "(()"
 * Output: 2
 * Explanation: The longest valid parentheses substring is "()"
 * <p>
 * Example 2:
 * <p>
 * Input: ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()"
 */
public class Problem032 {
    public static void main(String[] args) {
//        String str = "(((())))";
//        String str = "()(())";
//        String str = "(";
//        String str = "(()";
        String str = "))())()()())))))";
        int len = new Solution().longestValidParentheses(str);
        int le = new Solution().longestValidParentheses1(str);
        System.out.println(len);
        System.out.println(le);
    }


    static class Solution {
        public int longestValidParentheses1(String s) {
            // 用于记录待匹配的左括号和右括号的位置
            Stack<Integer> st = new Stack<>();
            int max = 0;
            for (int i = 0; i < s.length(); i++) {

                // 如是当前字符是右括号，并且记录栈非空，并且前一个字符是左括号
                if (s.charAt(i) == ')' && !st.isEmpty() && s.charAt(st.peek()) == '(') {
                    // 左括号出栈
                    st.pop();
                    // 求最大值
                    max = Math.max(max, i - ((st.isEmpty()) ? -1 : st.peek()));
                }
                // 其它情况就将字符入栈
                else {
                    st.push(i);
                }
            }
            return max;
        }
        public int longestValidParentheses(String s) {
            Stack<String> st = new Stack<>();
            int max = 0;
            int len = s.length();
            for (int i = 0; i < len; i++) {
                if (s.charAt(i) == '(' && (st.isEmpty() || st.peek().equals(")"))) {
                    st.push("(");
                } else if (i > 0 && s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == ')') {
                    //
                    st = new Stack<>();
                } else if (s.charAt(i) == ')' && !st.isEmpty() && st.peek().equals("(")) {
                    st.push(")");
                }
                max = Math.max(st.size(), max);
            }

            return max == 1 ? 0 : max;
        }
    }
}
