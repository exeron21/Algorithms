package leetcode;

import java.util.Stack;

public class LeetcodeRecursition {
    public static void main(String[] args) {
        char[] s = {'a', 'b','c','d','e','f','g'}; // 7
        new Solution().reverseString(s);
        for (char c: s) {
            System.out.print(c + ",");
        }
    }

    static class Solution {
        public void reverseString(char[] s) {
            int len = s.length;
            getStr(s, len, len/2);
        }

        void getStr(char[] s, int len, int half) {
            if (half <= 0) {
                return;
            }
            char c = s[half -1];
            s[half-1] = s[len -half];
            s[len -half] = c;
            getStr(s,len,--half);
        }
    }
}
