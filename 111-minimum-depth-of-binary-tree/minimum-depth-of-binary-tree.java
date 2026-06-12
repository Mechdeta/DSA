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
    public int minDepth(TreeNode root) {
        if(root==null)return 0;

        int minl=minDepth(root.left);
        int minr=minDepth(root.right);

        if(root.left==null&&root.right==null)return 1;

        if(root.left==null)return minr+1;
        if(root.right==null)return minl+1;

        return Math.min(minl,minr)+1;
        
    }
}