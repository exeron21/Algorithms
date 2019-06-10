package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 500. Keyboard Row
 * Easy
 *
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard
 *
 * Example:
 *
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 *
 *
 * Note:
 *
 *     You may use one character in the keyboard more than once.
 *     You may assume the input string will only contain letters of alphabet.
 */
public class Problem500 {
    public static void main(String[] args) {
        String[] res = {"Hello", "World", "Alaska", "Dad", "Peace"};
        String[] ret = new Solution().findWords(res);
        for (String s : ret) {
            System.out.println(s);
        }
    }

    static class Solution {
        String[] keyboard = {"qwertyuiopQWERTYUIOP", "asdfghjklASDFGHJKL", "zxcvbnmZXCVBNM"};

        /**
         * 字符串最好避免使用substring，效率低
         * @param res
         * @param s1
         * @return
         */
        private boolean sameChar(String res, String s1) {
            for (char c : res.toCharArray()) {
                if (s1.indexOf(c) == -1) {
                    return false;
                }
            }
            return true;
//            int m = 0;
//            for (int i = 0; i < res.length(); i++) {
//                if (s1.contains(res.substring(i, i + 1))) {
//                    m++;
//                }
//            }
//            return m == res.length();
        }

        public String[] findWords(String[] words) {
            List<String> ret = new ArrayList<>();
            for (String s : words) {
                for (String key : keyboard) {
                    boolean m = sameChar(s, key);
                    if (m) {
                        ret.add(s);
                        break;
                    }
                }
            }

            String[] rs = new String[ret.size()];
            int j = 0;
            for (String ss : ret) {
                rs[j] = ss;
                j++;
            }

            return rs;
        }
    }
}
