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
    public static boolean check(TreeNode node,int target){
        if(node==null)return false;
        if(node.left==null&& node.right==null){
            return target==node.val;
        }
        return check(node.left,target-node.val)||check(node.right,target-node.val);

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return check(root,targetSum);
    }
}