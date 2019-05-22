package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 219. Contains Duplicate II
 * Easy
 *
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *
 * Example 2:
 *
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */
public class Problem219 {
    public static void main(String[] args) {
//        int[] nums = {88,88};
//        int[] nums = {1,0,1,1};
        int[] nums = {1};
//        int[] nums = {1,2,3,1,2,3,4};
        int k =1;
        boolean flag = new Solution().containsNearbyDuplicate(nums, k);
        System.out.println(flag);
    }

    static class Solution {
        public boolean containsNearbyDuplicate1(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i=0;i<nums.length;i++) {
                Integer im = map.put(nums[i], i);
                if(im != null && i <= im +k) {
                    return true;
                }
            }
            return false;
        }

        /**
         *
         * @param nums
         * @param k
         * @return
         */
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            int len = nums.length;
            for (int i = 0; i< len;i++) {
                for (int j = i +1; j<=i+k && j< len;j++) {
                    if (nums[i] == nums[j]) return true;
                }
            }
            return false;
        }
    }
}
