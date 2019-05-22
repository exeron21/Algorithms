package leetcode;

/**
 * 541. Reverse String II
 * Easy
 *
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
 *
 * Example:
 *
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 *
 * Restrictions:
 *
 *     The string consists of lower English letters only.
 *     Length of the given string and k will in the range [1, 10000]
 */
public class Problem541 {
    public static void main(String[] args) {
        String s = "helloworld";
        String r = new Solution().reverseStr(s, 3);
        System.out.println(r);
    }
    static class Solution {
        public String reverseStr(String s, int k) {
            char[] arr = s.toCharArray();
            int len = arr.length;
            int index = 0;
            while(index < len - 1) {
                // 三种情况。。
                // 1、剩下的不到k个字符，反转全部
                // 2、剩下的字符数[k, 2k),只反转前k个字符
                // 3、剩下的字符数>=2k，反转k个字符
                // helloworld
                // len=10,k=2,index=8
                if (len - index > k) {

                } else {

                }
                index = index + 2*k;
            }
            return null;
        }
    }
}
