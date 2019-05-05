package leetcode;

import java.util.Arrays;

/**
 * 977. Squares of a Sorted Array
 * Easy
 *
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 *
 * Example 2:
 *
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 *
 * Note:
 *
 *     1 <= A.length <= 10000
 *     -10000 <= A[i] <= 10000
 *     A is sorted in non-decreasing order.
 *
 *     思路：左右指针同时进行，如果某边指针指向的数字绝对值大于另外一边，平方之，放在新数组的最右边，同时这一边的指针+1(或-1)
 */
public class Problem977 {
    public static void main(String[] args) {
        int[] A = {-2,0,3,-1,5};
        int[] B = new Solution().sortedSquares(A);
        for (int i : B) {
            System.out.print(i + ",");
        }
    }

    static class Solution {
        public int[] sortedSquares1(int[] A) {
            for (int i=0; i<A.length;i++) {
                A[i] = A[i] * A[i];
            }
            Arrays.sort(A);
            return A;
        }
        public int[] sortedSquares(int[] A) {
            int[] ret = new int[A.length];
            for (int i=0,j =A.length-1,p=j;p>-1;p--) {
                if(Math.abs(A[i]) > Math.abs(A[j])) {
                    ret[p] = A[i] * A[i];
                    i ++;
                } else {
                    ret[p] = A[j] * A[j];
                    j --;
                }
            }
            return ret;
        }
    }
}
