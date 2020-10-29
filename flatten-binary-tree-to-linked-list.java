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
    public void flatten(TreeNode root) {
        if(root== null)
        {
            return;
        }
        Stack<TreeNode> s = new Stack();
        s.push(root);
        while(!s.isEmpty())
        {
            TreeNode current = s.pop();
            if(current.right!=null)
            {
                s.push(current.right);
            }
            if(current.left!=null)
            {
                s.push(current.left);
            }
            if(!s.isEmpty())
            {
                current.right=s.peek();
                
            }
            current.left=null;

        }
        
    }
}