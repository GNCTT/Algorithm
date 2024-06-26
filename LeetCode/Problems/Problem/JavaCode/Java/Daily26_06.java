import java.util.List;

public class Daily26_06 {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {

        TreeNode[] trees = new TreeNode[10000];
        int index = 0;
        public void trees(TreeNode root) {
            if (root == null) return;
            // if (root.left == null && root.right == null) {
            //     return;
            // }
            trees(root.left);
            trees[index] = root;
            index++;
            trees(root.right);
        }

        public TreeNode buildTree(int start, int end) {
            if (start > end) return null;
            int mid = (start) + (end - start) / 2;
            if (mid < 0 || mid >= index) return null;
            TreeNode leftSubTree = buildTree(start, mid - 1);
            TreeNode rightSubTree = buildTree(mid + 1, end);
            TreeNode node = new TreeNode(
                    trees[mid].val,
                    leftSubTree,
                    rightSubTree
            );
            return node;

        }

        public TreeNode balanceBST(TreeNode root) {
            trees(root);
            return buildTree(0, index);
        }
    }
}
