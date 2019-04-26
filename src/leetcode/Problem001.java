package leetcode;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class Problem001 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 7;
        int[] result = new Solution().twoSum(nums, target);
        for (int i :result) {
            System.out.print(i + ",");
        }
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int i = 0;
            for (int n : nums) {
                map.put(n, i++);
            }
            for (int j=0;j<nums.length;j++) {
                int comp = target - nums[j];
                if (map.containsKey(comp) && map.get(comp) != j) {
                    return new int[] {j, map.get(comp)};
                }
            }

            throw new IllegalArgumentException("never found.");
        }
    }
}

