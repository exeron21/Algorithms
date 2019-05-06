package leetcode;

/**
 * 1037. Valid Boomerang
 * Easy
 *
 * A boomerang is a set of 3 points that are all distinct and not in a straight line.
 *
 * Given a list of three points in the plane, return whether these points are a boomerang.
 *
 *
 *
 * Example 1:
 *
 * Input: [[1,1],[2,3],[3,2]]
 * Output: true
 *
 * Example 2:
 *
 * Input: [[1,1],[2,2],[3,3]]
 * Output: false
 *
 *
 *
 * Note:
 *
 *     points.length == 3
 *     points[i].length == 2
 *     0 <= points[i][j] <= 100
 */
public class Problem1037 {
    // 在一条线上就返回true，不在一条线上就返回false
    public static void main(String[] args) {
        int[][] mat = {{1,1},{3,1},{2,2}};
//        int[][] mat = {{1,1},{2,2},{3,3}};
        boolean flag = new Solution().isBoomerang(mat);
        System.out.println(flag);
    }

    static class Solution {
        public boolean isBoomerang(int[][] points) {
            int i= points[1][0] - points[0][0];
            int j =points[1][1] - points[0][1];
            int k =points[2][0] - points[0][0];
            int l= points[2][1] - points[0][1];
            return i*l != k*j;
        }

        public boolean isBoomerang1(int[][] points) {
            int len = points.length;
            double[] res = new double[len];
            if ((points[0][0] == points[1][0] && points[0][1] == points[1][1])
            || (points[1][0] == points[2][0] && points[1][1] == points[2][1])
            || (points[0][0] == points[2][0] && points[0][1] == points[2][1])){
                return false;
            }
            for (int i=0;i<len;i++) {
                int[] tmp = points[i];
                res[i] = (double)tmp[1]/ tmp[0];
            }
            for(double d : res) {
                System.out.println(d);
            }
            return !(res[0] == res[1] && res[1] == res[2]);
        }
    }
}
