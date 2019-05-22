package leetcode;

/**
 * 把数字改为字符串表达方式：(遇J进位)
 * 1->A
 * 2->B
 * 3->C
 * ...
 * 0->J
 * 需要注意的是，单独的0是没有意义的
 */
public class Problem168_2 {
    public static void main(String[] args) {
        String s = new Solution().convertToTitle(11);
        System.out.println(s);
    }

    static class Solution {
        public String convertToTitle(int n) {
            if (n <= 0) return "";
            StringBuilder str = new StringBuilder();
            while (n > 0) {
                n--;
                str.append((char) ('A' + n % 10));
                n /= 10;
            }
            return str.reverse().toString();
        }
    }
}
