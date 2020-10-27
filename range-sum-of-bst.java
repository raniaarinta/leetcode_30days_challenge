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
    int range_sum;
    public int rangeSumBST(TreeNode root, int L, int R) {
        range_sum=0;
        range(root,L,R);
        return range_sum;
    }
    public void range(TreeNode root, int L, int R)
    {
        if(root!=null)
        {
            if(root.val>= L && root.val<= R)
            {
                range_sum = range_sum + root.val;
               
            }
            if(root.val >L)
            {
                 range(root.left,L,R);
            }
            if(root.val< R)
            {
                range(root.right,L,R);
            }

        }
    }
}