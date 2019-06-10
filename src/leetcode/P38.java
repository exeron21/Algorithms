package leetcode;

/**
 * 38. Count and Say
 * Easy
 *
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 *
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 *
 *
 * Example 1:
 *
 * Input: 1
 * Output: "1"
 *
 * Example 2:
 *
 * Input: 4
 * Output: "1211"
 */

// 就是数数：111223的返回结果是312213，即：3个1 2个2 1个3
// 111223345556 = 312223143516
public class P38 {
    public static void main(String[] args) {
        Solution so = new Solution();
        String ret = so.countAndSay(10);
        System.out.println(ret);

        String str = "1112233455556";
        String re = so.practice(str);
        System.out.println(str + " === " + re);
    }
    static class Solution {
        public String countAndSay(int n) {
            String num = "1";
            for (int i =2;i<=n;i++) {
                num = count(num);
                System.out.println(i + "==" + num);
            }
            return num;
        }

        // 21 2 1!=2 12
        private String count (String ret) {
            if (ret.equals("1")) return "11";
            int len = ret.length();
            char[] arr = ret.toCharArray();
            char c = arr[0];
            int count = 1;
            StringBuilder str = new StringBuilder();
            for (int i=1;i<len;i++ ) {
                if (arr[i] == c) {
                    count++;
                } else {
                    str.append(count).append(c);
                    c = arr[i];
                    count = 1;
                }
            }
            str.append(count).append(c);
            return str.toString();
        }

        public String practice(String str) {
            if (str == null || "".equals(str.trim())) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            char[] arr = str.toCharArray();
            int len = arr.length;
            char c = arr[0];
            int count = 1;
            // 112
            for (int i =1;i<len;i++) {
                if (arr[i] == c) {
                    count ++;
                } else {
                    sb.append(count).append(c);
                    count = 1;
                    c = arr[i];
                }
            }
            sb.append(count).append(c);

            return sb.toString();
        }
    }
}
