package leetcode;

/**
 * 344. Reverse String
 * Easy
 *
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 *
 *
 * Example 1:
 *
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * Example 2:
 *
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */
public class Problem344 {
    public static void main(String[] args) {
        String str = "problems?";
        char[] s = str.toCharArray();
        new Solution().reverseString(s);
        for (char c : s) {
            System.out.print(c + ",");
        }
    }

    static class Solution {
        public void reverseString(char[] s) {
            // 递归解法
//            int len = s.length;
//            reverseString1(s, len, len/ 2);
            // 非递归解法
            reverseString0(s);
        }

        private void reverseString0(char[] s) {
            int len = s.length;
            int index = len/2;
            while(index>0) {
                char tmp = s[index-1];
                s[index-1] = s[len-index];
                s[len-index--] = tmp;
            }
        }

        // 思路：假定一个char型数组是"helloworld!".toCharArray,length为11
        // 先从index=s[len/2-1]处开始遍历，将其与“相对”位置的字符(s[len-index])交换，然后index--
        // index<=0跳出遍历
        // len = 6,idx =3
        // 2~3 1~4 0~5
        // 0 1 2 3 4 5

        // len = 7,idx=3
        // 2~4 1~5 0~6
        // 0 1 2 3 4 5 6
        public void reverseString1(char[] s, int len, int idx) {
            if (idx <= 0) {
                return;
            } else {
                char tmp = s[idx-1];
                s[idx-1] = s[len-idx];
                s[len-idx] = tmp;
                reverseString1(s, len, --idx);
            }
        }
    }
}
