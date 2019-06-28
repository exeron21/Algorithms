package leetcode;

/**
 * 75. Sort Colors
 * Medium
 *
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 *
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 * Note: You are not suppose to use the library's sort function for this problem.
 *
 * Example:
 *
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 *
 * Follow up:
 *
 *     A rather straight forward solution is a two-pass algorithm using counting sort.
 *     First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
 *     Could you come up with a one-pass algorithm using only constant space?
 */
public class Problem075 {
    public static void main(String[] args) {

        int[] nums = {2,0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1,2,0,1};
//        int[] nums = {2,0,2,1,1,0};
        new Solution().sortColors2(nums);
        for (int i : nums) {
            System.out.print(i + ",");
        }
    }


    /**
     * 3点交换法，这个稍微难一点
     * 1.先把第1个1的位置p1和第1个2的位置p2都设置为0
     * 2.从0开始向右遍历，遇到0，则将p2位置上的值给c（c的值被覆盖了，没关系，因为知道c=0）,p1位置上的值给p2,p1赋值为0,p1++,p2++
     *      其实就是把p2,p1,c的值换了一下，p2的值是先给c的，因为c始终在右边，c>=p2>=p1
     * 2.遇到1，即c=1，交换p2和c的位置,p2++
     */
    static class Solution {

        public void sortColors2(int[] nums) {
            int p1 = 0;
            int p2 = 0;
            int c = 0;
            int len = nums.length;
            while (c < len) {
                if (nums[c] == 0) {
                    nums[c] = nums[p2];
                    nums[p2] = nums[p1];
                    nums[p1] = 0;
                    p2 ++;
                    p1 ++;
                } else if (nums[c] == 1) {
                    nums[c] = nums[p2];
                    nums[p2] = 1;
                    p2 ++;
                }
                c++;
            }
        }







        public void sortColors(int[] nums) {
            if (nums == null || nums.length == 0) return;
            int c = 0,p1 = 0, p2 = 0,n= nums.length;
            while (c < n) {
                if (nums[c] == 0) {
                    nums[c] = nums[p2];
                    nums[p2] = nums[p1];
                    nums[p1] = 0;
                    p1++;
                    p2++;
                } else if (nums[c] == 1) {
                    nums[c] = nums[p2];
                    nums[p2] = 1;
                    p2 ++;
                }
                c ++;
            }
        }

        /**
         * 这个略微简单
         * 1.从左向右遍历，设左指针为L，右指针为R，中间指针为M
         * 2.L向右跳过所有的0，R向左跳过所有的2
         * 3.M=L，然后M跳过所有的1，判断M==0，和L交换位置，L++。M==1，和R交换，R--
         * @param nums
         */
        public void sortColors1(int[] nums) {
            if (nums == null || nums.length == 0) return;
            int left = 0;
            int right = nums.length -1;
            while (left < right) {
                while (left < right && nums[left] == 0) left ++;
                while (left < right && nums[right] == 2) right --;
                int middle = left;
                while(middle < right && nums[middle] == 1) middle++;
                if (nums[middle] == 0) {
                    swap(left, middle, nums);
                    left++;
                } else {
                    swap(middle, right, nums);
                    right--;
                }
            }
        }

        private void swap(int left, int right, int[] nums) {
            int t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;
        }
    }
}
