package leetcode;

import java.util.HashMap;

/**
 * 167. Two Sum II - Input array is sorted
 *
 * Easy
 *
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 *
 * Note:
 *
 *     Your returned answers (both index1 and index2) are not zero-based.
 *     You may assume that each input would have exactly one solution and you may not use the same element twice.
 *
 * Example:
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class Problem167 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 7;
        int[] res = new Solution().twoSum(nums, target);
        for(int i:nums) {
            System.out.print(i+",");
        }
        System.out.println();
        for(int i:res) {
            System.out.print(i + ",");
        }
    }
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int left = 0;
            int right = nums.length -1;
            while(left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    break;
                } else if (sum > target) {
                    right -- ;
                } else {
                    left ++;
                }
            }
            return new int[]{left + 1, right + 1};
        }
        public int[] twoSum1(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int m = 0;
            for (int num : nums) {
                map.put(num, m++);
            }
            for (int i = 0;i<nums.length;i++) {
                int comp = target - nums[i];
                if (map.containsKey(comp) && map.get(comp) != i) {
                    return new int[] {i+1, map.get(comp)+1};
                }
            }

            throw new IllegalArgumentException("never found");
        }
    }
}

