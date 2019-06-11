package leetcode;

public class BitOperation01 {

    public static void main(String[] args) {

        BitOperation01 bo = new BitOperation01();
        System.out.println(Integer.toBinaryString(1024));
        System.out.println(Integer.toBinaryString(-1024));
//        int[] arr = {2,2,3,4,5,6,2,3,4,5,6};
//        int m = arr[0];
//        for (int i=1;i<arr.length;i++) {
//            m = m^arr[i];
//        }
//
//        System.out.println(m);
//
//        int n = 123;
//        boolean b = new leetcode.BitOperation01().isPowerOfThree(n);
//        System.out.println(b);

        boolean fa = bo.isPowerOfFour(100);
        System.out.println(fa);

    }


    private boolean bitOperation01(int i) {
        return i > 0 && ((i & (i-1)) == 0);
    }

    private long getBiggestPowerOfFour() {
        long i = 1;
        while(i<Integer.MAX_VALUE/4) {
            i *= 4;
            System.out.println(i);
        }

        return i;
    }

    private boolean isPowerOfFour(int num) {
        return (num >0) && ((num & -num) == num) && ((0x55555555 & num) == num);
    }

    private boolean isPowerOfThree(int n) {
        return false;
    }
}
