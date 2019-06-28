package geektime;

public class InsertSort {
    static int[] nums = {9,1,5,8,2,4,0,7,3,6};
    public static void main(String[] args) {
        p();
        doSort();
        p();
    }

    private static void p() {
        for (int i:nums) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    private static void doSort() {
        int n = nums.length;
        for (int i=1;i<n; i++ ) {
            int val = nums[i];
            int j = i-1;
            for (;j>=0;j--) {
                if (nums[j] > val) {
                    nums[j+1] = nums[j];
                } else {
                    break; // 这个break相当重要，如果没有的话就会错误
                }
            }
            nums[j+1] = val;
        }
    }
}
