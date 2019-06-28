package leetcode;

public class Problem215 {
    public static void main(String[] args) {
        int[] nums = {2,4,3,0,7,9,8,5,1,6};
//        int[] nums = {2,1};
        int k = 1;
        int ret = new Solution().findKthLargest(nums, k);
        for (int i:nums) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println(ret);
    }

    static class Solution {

        // 插入排序, 有点难以理解呢
        public int findKthLargest(int[] nums, int k) {
            int n = nums.length;
            for (int i =1;i<n;i++) {
                int value = nums[i];
                int j = i-1;
                for (;j>=0;j--) {
                    if (nums[j] < value) {
                        nums[j+1] = nums[j];
                    } else {
                        break;
                    }
                }
                nums[j+1] = value;
            }
            return nums[k-1];
        }

        // BubbleSort怎么也不可能快
        public int findKthLargest3(int[] nums, int k) {
            int n = nums.length;
            for(int i=0;i<n ;i++) {
                boolean flag = false;
                for (int j =0;j<n-i-1;j++) {
                    if (nums[j] < nums[j+1]) {
                        flag = true;
                        int tmp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = tmp;
                    }
                }
                if (!flag) break;
            }
            return nums[k-1];
        }
        // 事实证明，O(N^2)的排序太慢了。。
        public int findKthLargest2(int[] nums, int k) {
            int tmp;
            for (int i =0;i<nums.length;i++) {
                int max = i;
                for (int j =i;j<nums.length;j++) {
                    if (nums[j] > nums[max]) {
                        max = j;
                    }
                }
                if (nums[i] < nums[max]) {
                    tmp = nums[i];
                    nums[i] = nums[max];
                    nums[max] = tmp;
                }
            }
            return nums[k-1];
        }
        // 最初的版本，时间复杂度最高。。交换次数最多。。
        public int findKthLargest1(int[] nums, int k) {
            int tmp ;
            for (int i =0;i<nums.length;i++) {
                for (int j =0;j<nums.length;j++) {
                    if (nums[j] < nums[i]) {
                        tmp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = tmp;
                    }
                }
            }
            return nums[k-1];
        }
    }
}
