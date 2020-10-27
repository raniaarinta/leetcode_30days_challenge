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
    public boolean isUnivalTree(TreeNode root) {
        boolean right=false, left=false;
        if(root.left== null || root.left.val== root.val && isUnivalTree(root.left))
        {
            left=true;
        }
        if(root.right== null || root.right.val== root.val && isUnivalTree(root.right))
        {
            right=true;
        }
        return left && right;
        
    }
}