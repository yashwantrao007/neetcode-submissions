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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Deque<TreeNode> pque = new LinkedList<>();
        Deque<TreeNode> qque = new LinkedList<>();

        pque.offer(p);
        qque.offer(q);

        while(!pque.isEmpty() && !qque.isEmpty()){
            TreeNode pRoot = pque.pop();
            TreeNode qRoot = qque.pop();

            if(pRoot == null && qRoot == null) continue;

            if(pRoot == null || qRoot == null || pRoot.val != qRoot.val){
                return false;
            }

            pque.offer(pRoot.left);
            qque.offer(qRoot.left);
            

            pque.offer(pRoot.right);
            qque.offer(qRoot.right);
        }

        return(pque.isEmpty() && qque.isEmpty());

        
    }
}
