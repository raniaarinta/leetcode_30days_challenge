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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList();
        Queue<TreeNode> q= new LinkedList();
        if(root== null)
        {
            return result;
        }
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode current = q.poll();
            if(q.isEmpty)
            {
                result.add(current.val);
            }
            if(current.right!=null)
            {
                q.offer(current.right);
            }
            if(current.left!=null)
            {
                q.offer(current.left);
            }
        }
        return result;

        
    }
}