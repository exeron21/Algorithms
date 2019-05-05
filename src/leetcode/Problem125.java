package leetcode;

/**
 * 125. Valid Palindrome
 * Easy
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */
public class Problem125 {
    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";
//        String str = "AA";
//        String str = "A,bA";
//        String str = ".,";
//        String str = "Azb,b.A";
//        String str = "race a acar";
        boolean flag = new Solution().isPalindrome(str);
        System.out.println(flag);
    }

    static class Solution {

        boolean isPalindrome(String str) {
            int start=0,end=str.length()-1;
            while(start < end) {
                char cStart = str.charAt(start);
                char cEnd = str.charAt(end);
                boolean validL = validChar(cStart);
                boolean validR = validChar(cEnd);
                System.out.println(cStart + " = " + cEnd);
                if (validL && validR) {
                    if (cStart >='a' && cStart <= 'z') {
                        cStart = (char)(cStart-32);
                    }
                    if (cEnd>='a' && cEnd <= 'z') {
                        cEnd = (char)(cEnd-32);
                    }
                    if (cStart == cEnd) {
                        start++;
                        end--;
                    } else {
                        return false;
                    }
                } else {
                    if (!validL) start++;
                    if (!validR) end--;
                }
            }
            return true;
        }
        boolean validChar(char c) {
            return (c>='0' && c<='9') || (c>='a' && c <= 'z') || (c>='A' && c<='Z');
        }

        public boolean isPalindrome3(String str) {
            char[] arr = new char[128];
            for (int i = '0'; i <= '9'; i++) {
                arr[i] = (char) i;
            }
            for (int i = 'A'; i <= 'Z'; i++) {
                arr[i] = (char) i;
            }
            for (int i = 'a'; i <= 'z'; i++) {
                arr[i] = (char) (i - 32);
            }
            char[] strarr = str.toCharArray();
            int iStart = 0, iEnd = str.length() - 1;
            char cStart, cEnd;
            while (iStart < iEnd) {
                cStart = arr[strarr[iStart]];
                cEnd = arr[strarr[iEnd]];
                if (cStart != 0 && cEnd != 0) {
                    if (cStart == cEnd) {
                        iStart++;
                        iEnd--;
                    } else {
                        return false;
                    }
                } else {
                    if (cStart == 0) iStart++;
                    if (cEnd == 0) iEnd--;
                }
            }
            return true;
        }

        /**
         * 转换成小写再去掉非字符和数字的部分，再同时从首尾遍历到中间
         * @param s
         * @return
         */
        public boolean isPalindrome2(String s) {
            s = s.toLowerCase();
            s = s.replaceAll("[^a-z|\\d]", "");
            int i = s.length();
            int j = i / 2;
            for (int k = 0; k < j; k++, i--) {
                char l = s.charAt(k);
                char r = s.charAt(i - 1);
                if (l != r) {
                    return false;
                }
            }
            return true;
        }

        /**
         * 调用API，先转换成小写，再去掉非字符和数字的部分，然后再后半部分反转，与前半部分比较
         * @param s
         * @return
         */
        public boolean isPalindrome1(String s) {
            s = s.toLowerCase();
            s = s.replaceAll("[^a-z|\\d]", "");
            System.out.println(s);
            int i = s.length();
            int j = i / 2;
            String l = s.substring(0, j);
            System.out.println(l);
            j = i % 2 == 1 ? j + 1 : j;
            String r = s.substring(j, i);
            StringBuilder sb = new StringBuilder();
            for (int k = r.length() - 1; k >= 0; k--) {
                sb.append(r.charAt(k));
            }
            System.out.println(sb.toString());
            return l.equals(sb.toString());
        }
    }
}
