package leetcode;


public class P74 {
    public static void main(String[] args) {

        int[][] matrix = {{1,1}};
//        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
//        int[][] matrix = {{1,2,3,4},{2,3,4,5},{3,5,6,7}};
//        System.out.println(matrix.length);
//        System.out.println(matrix[0].length);
        for (int[] amat : matrix) {
            for (int b : amat) {
                System.out.print(b+",");
            }
            System.out.println();
        }

        System.out.println("==================");
        int target = 2;
        P74 p = new P74();
        boolean result = p.searchMatrix(matrix, target);
        System.out.println(result);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0)
            return false;
        int n = matrix[0].length;
        if (n == 0)
            return false;
        int idx = 0, idy = n-1;
        int result = matrix[idx][idy];
        while(true) {
            if (result == target) {
                return true;
            }
            if (result > target) {
                if (idy > 0)
                    result = matrix[idx][--idy];
            } else if (result < target) {
                if (idx <m-1)
                    result = matrix[++idx][idy];
            }
            System.out.println(result);
            if (result == target) {
                return true;
            }
            if (idx >= m -1 && idy <= 0) {
                return false;
            }
        }
    }
}// 2
//1,1