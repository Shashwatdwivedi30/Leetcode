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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        PostOrder(root, l);
        return l;
    }

    public void PostOrder(TreeNode root, List<Integer> l){
        if(root == null) 
           return;
        PostOrder(root.left, l);
        PostOrder(root.right, l);
        l.add(root.val);
    }
}