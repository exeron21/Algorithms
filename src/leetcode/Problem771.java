package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 771. Jewels and Stones
 * Easy
 *
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 *
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 *
 * Example 2:
 *
 * Input: J = "z", S = "ZZ"
 * Output: 0
 *
 * Note:
 *
 *     S and J will consist of letters and have length at most 50.
 *     The characters in J are distinct.
 */
public class Problem771 {
    public static void main(String[] args) {
        int re = new Solution().numJewelsInStones("aA", "aAAbbbbb");
        System.out.println(re);
    }

    static class Solution {
        public int numJewelsInStones(String J, String S) {
            int r = 0;
            for (char c : S.toCharArray()) {
                if (J.indexOf(c) != -1) r++;
            }
            return r;
        }

        public int numJewelsInStones2(String J, String S) {
            Set<Character> jset = new HashSet<>();
            for (char c: J.toCharArray()) {
                jset.add(c);
            }
            int r = 0;
            for (char c : S.toCharArray()) {
                if (jset.contains(c)) {
                    r ++;
                }
            }
            return r;
        }
        public int numJewelsInStones1(String J, String S) {
            int len = S.length();
            int lenj = J.length();
            int re = 0;
            for(int i=0;i<len;i++) {
                for (int j=0;j<lenj;j++) {
                    if (J.charAt(j) == S.charAt(i)) {
                        re ++;
                    }
                }
            }
            return re;
        }
    }
}
