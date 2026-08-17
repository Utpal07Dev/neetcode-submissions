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
    private int  count = 0;
    int result = -1;
    public  void preOrder(TreeNode node,int k){
       if(node ==null || count>=k){
        return;
       }
       preOrder(node.left,k);
       count++;
       if(count==k){
        result = node.val;
        return;
       }
       preOrder(node.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        preOrder(root,k);
        return result;
    }
}
