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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
                Queue<TreeNode> q = new ArrayDeque<>();
                if(root==null)return result;
                q.offer(root);
                boolean leftToRight = true;
                while(!q.isEmpty()){
                    int n = q.size();
                    List<Integer> currList = new ArrayList<>(n);
                    for(int i = 0;i<n;i++){
                        TreeNode cur = q.poll();
                        if(leftToRight){
                            currList.add(cur.val);
                        }else{
                            currList.addFirst(cur.val);
                        }
                        if(cur.left!=null)q.offer(cur.left);
                        if(cur.right!=null)q.offer(cur.right);
                    }
                    leftToRight = !leftToRight;
                    result.add(currList);
                }
                return result;
    }
}