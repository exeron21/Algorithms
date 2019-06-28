package geektime;

public class BubbleSort {

    static int[] nums = {3,-1,0,5,1,4,2};
    private static void p() {
        for(int i:nums) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        BubbleSort.doSort(nums);
        BubbleSort.doReverseSort(nums);
//        p();
    }

    private static void doReverseSort(int[] nums) {
        int n = nums.length;
        for (int i =0;i<n;i++) {
            p();
            boolean flag = false;
            for (int j=0;j<n-i-1;j++) {
                if (nums[j] < nums[j+1]) {
                    flag = true;
                    // do switch
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
            if (!flag) break;
        }
    }

    private static void doSort(int[] nums) {
        int n = nums.length;
        for (int i=0;i<n;i++) {
            p();
            boolean flag = false;
            for (int j=0;j<n-i-1;j++) {
                if (nums[j] > nums[j+1]) {
                    flag = true;
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
            if (!flag) break;
        }
    }
}
