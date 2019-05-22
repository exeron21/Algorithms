package leetcode;

/**
 * 100. Same Tree
 * Easy
 *
 * Given two binary trees, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 *
 * Example 1:
 *
 * Input:     1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * Output: true
 *
 * Example 2:
 *
 * Input:     1         1
 *           /           \
 *          2             2
 *
 *         [1,2],     [1,null,2]
 *
 * Output: false
 *
 * Example 3:
 *
 * Input:     1         1
 *           / \       / \
 *          2   1     1   2
 *
 *         [1,2,1],   [1,1,2]
 *
 * Output: false
 */
public class Problem100 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class Solution {
        public static void main(String[] args) {
//            boolean b = new Solution().isSameTree1(new TreeNode(10), new TreeNode(9));
            TreeNode n0 = new TreeNode(10);
            boolean b = new Solution().isSameTree(new TreeNode(10), new TreeNode(9));
            System.out.println(b);
        }

        boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null || q == null)
                return (p == q);
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }


        private String DFS(String ans, TreeNode root) {
            if (root == null) {
                ans += "null,";
                return ans;
            }
            ans += String.valueOf(root.val) + ",";
            ans = DFS(ans, root.left);
            ans = DFS(ans, root.right);
            return ans;
        }

        /**
         * 别人的解法,wtf?
         * @param p
         * @param q
         * @return
         */
        public boolean isSameTree1(TreeNode p, TreeNode q) {
            if (p == null && q == null)
                return true;
            if (p == null || q == null)
                return false;

            String ans1 = "";
            String ans2 = "";
            ans1 = DFS(ans1, p);
            ans2 = DFS(ans2, q);
            System.out.println("String1" + ans1);
            System.out.println("String2" + ans2);
            return ans1.equals(ans2);
        }
    }
}
