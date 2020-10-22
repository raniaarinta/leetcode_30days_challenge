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
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> result= new ArrayList();
        dfs(root,result,0);
        return result;
    }
    public void dfs(TreeNode root,List<Integer> max_value, int level ) 
    {
        if (root== null)
        {
            return;
        }
        if(level==max_value.size())
        {
            max_value.add(root.val);

        }
        else
        {
            max_value.set(level, Math.max(max_value.get(level), root.val));

        }
        dfs(root.right,max_value,level+1);
        dfs(root.left,max_value,level+1);

    }
}