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
    public int maxpath(TreeNode root,int[] ans){
        if(root==null) return 0;
        int left=Math.max(0,maxpath(root.left,ans));
        int right=Math.max(0,maxpath(root.right,ans));
        ans[0]=Math.max(ans[0],left+right+root.val);
        return root.val+Math.max(right,left);
    } 
    public int maxPathSum(TreeNode root) {
        int[] ans= new int[1];
        ans[0]=Integer.MIN_VALUE;
        maxpath(root,ans);
        return ans[0];
    }
}