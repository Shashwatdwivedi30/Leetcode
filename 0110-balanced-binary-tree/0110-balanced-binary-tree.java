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
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    public int checkHeight(TreeNode node){
        if(node == null) return 0;

        int left_Height = checkHeight(node.left);
        if(left_Height == -1) return -1;

        int right_Height = checkHeight(node.right);
        if(right_Height == -1) return -1;

        if(Math.abs(left_Height - right_Height) > 1) return -1;
        return Math.max(left_Height, right_Height)+1;
    }
}