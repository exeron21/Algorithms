package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem217 {
    public static void main(String[] args) {
        int[] nums = {1,4,4,5,7,8,9,0,12};
        boolean flag = new Solution().containsDuplicate1(nums);
//        boolean flag = new Solution().containsDuplicate(nums);
        System.out.println(flag);
    }
    static class Solution {

        // 遇到很大的数组时会 TLE time limit exceeded
        public boolean containsDuplicate1(int[] nums) {
            Set<Integer> list = new HashSet<>(nums.length * 2);
            for (int n : nums) {
                if (list.contains(n)) {
                    return true;
                }
                list.add(n);
            }

            return false;
        }
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>(nums.length * 2);
            for(int n : nums) {

                set.add(n);
            }

            return set.size() == nums.length;
        }
    }
}
