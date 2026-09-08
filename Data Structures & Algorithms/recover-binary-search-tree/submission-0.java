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
    private TreeNode first;
    private TreeNode middle;
    private TreeNode last;
    private TreeNode prev;
    public void recoverTree(TreeNode root) {
        first = null;
        middle = null;
        last = null;
        
        // Initialize prev to a dummy node with the minimum possible value 
        // to avoid null checks, or just leave it null and handle it in inorder.
        // Handling null in inorder is standard and clean.
        prev = null;

        // 1. Find the misplaced nodes
        inorder(root);

        // 2. Swap the values back to recover the BST
        if (first != null && last != null) {
            // Case 2: The swapped nodes are not adjacent
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
        } else if (first != null && middle != null) {
            // Case 1: The swapped nodes are adjacent
            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
        }
    }

    private void inorder(TreeNode root){
        if(root==null)return;

        inorder(root.left);
        if(prev!=null && root.val<prev.val){
           if(first==null){
             first = prev;
            middle=root;
           }else{
            last = root;
           }
        }
        prev = root;
        inorder(root.right);

    }
}