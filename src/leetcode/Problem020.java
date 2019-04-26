package leetcode;

import java.util.Stack;

/**20. Valid Parentheses

 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.

 Note that an empty string is also considered valid.
 Example 1:

 Input: "()"
 Output: true

 Example 2:

 Input: "()[]{}"
 Output: true

 Example 3:

 Input: "(]"
 Output: false

 Example 4:

 Input: "([)]"
 Output: false

 Example 5:

 Input: "{[]}"
 Output: true

 */
public class Problem020 {
    public static void main(String[] args) {
        String s = "(([[{{}}]]))";
        boolean f = new Solution().isValid(s);
        System.out.println(f);
    }
    static class Solution{
        public boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
            int len = s.length();
            if (len == 0) {
                return true;
            }
            for (int i =0;i<len;i++) {
                if(bQuetos(s.charAt(i)) && !st.isEmpty() && pairs(s.charAt(i), st.peek())) {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }

            return st.empty();
        }

        static boolean quetos(char c) {
            return c == '(' || c == '[' || c == '{';
        }
        static boolean bQuetos(char c) {
            return c == ')' || c == ']' || c == '}';
        }
        static boolean pairs(char b, char a) {
            return (a == '(' && b == ')') || (a == '[') && b == ']' || (a == '{' && b == '}');
        }
    }
}
