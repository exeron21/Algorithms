package leetcode;

public class Problem074 {
    public static void main(String[] args) {
//        int[][] mat = {{1,3}};
//        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int[][] mat = {{1,3,5,7},{2,5,6,9},{3,6,8,10},{6,8,9,12}};
        for (int[] aMat : mat) {
            for (int bMat : aMat) {
                System.out.print(bMat + ",");
            }
            System.out.println();
        }

        int f = 1;
//        boolean result = search(mat, f);
//        System.out.println(result);

        int mid = mat.length * mat[0].length;
        int idx = mid / (mat.length * 2);
        int idy = mid % idx;
        System.out.println(idx);
        System.out.println(idy);
    }

    private static boolean search(int[][] matrix, int target) {
        int m = matrix.length;
        if ( m == 0) return false;
        int n = matrix[0].length;
        if (n == 0) {
            return false;
        }
        if (target < matrix[0][0] || target > matrix[m-1][n-1])
            return false;
        int len = m * n;
        int idx = 0;
        int idy = 0;
        while(true) {
            idx = len / 2;
            idy = len % idx;
        }
    }
}
