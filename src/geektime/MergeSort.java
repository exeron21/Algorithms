package geektime;

import java.util.Arrays;

public class MergeSort {
    static int[] nums = {9,1,5,8,2,4,0,7,3,6};
    public static void main(String[] args) {
        p();
        doSort(nums, 0, nums.length);
    }

    private static void doSort(int[] nums, int left, int right) {
        doSort1(nums, left, right);
        Arrays.sort(nums);
    }

    private static void doSort1(int[] nums, int left, int right) {
        if (left >= right) return;
        System.out.println("" + left + " == " + right);
        int middle = (left + right) / 2;
        doSort1(nums, left, middle);
        doSort1(nums, middle + 1, right);
    }

    private static void p() {
        for (int i:nums) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
