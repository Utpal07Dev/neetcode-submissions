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
    public static void dfs(int level,TreeNode root,List<List<Integer>> res){
        if(root==null)return;

        if(level==res.size()){
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        dfs(level+1,root.left,res);
        dfs(level+1,root.right,res);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        // List<List<Integer>> res = new ArrayList<>();
        // if(root==null)return res;

        // Queue<TreeNode> q = new ArrayDeque<>();
        // q.add(root);
        // while(!q.isEmpty()){
        //     int levelSize = q.size();
        //     List<Integer> current = new ArrayList<>(levelSize);
        //     for(int i = 0;i<levelSize;i++){
        //        TreeNode currentNode = q.poll();
        //         current.add(currentNode.val);
                
        //         if (currentNode.left != null) q.add(currentNode.left);
        //         if (currentNode.right != null) q.add(currentNode.right);
        //     }
        //     res.add(current);
        // }
        // return res;



        //Micmiking BFS in tree using DFs
        List<List<Integer>> res = new ArrayList<>();
        dfs(0,root,res);
        return res;
    }
}
