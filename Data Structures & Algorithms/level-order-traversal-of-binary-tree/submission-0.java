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
    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root == null) return new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> treeQueue = new ArrayDeque<>();

        treeQueue.add(root);

        while(!treeQueue.isEmpty()){
            int size = treeQueue.size();
            List<Integer> subList = new ArrayList<>();

            for(int i = 0; i<size; i++){
                if(treeQueue.peek().left!= null) treeQueue.add(treeQueue.peek().left);
                if(treeQueue.peek().right!= null) treeQueue.add(treeQueue.peek().right);

                subList.add(treeQueue.pop().val);
            }
            ans.add(subList);
        }


        return ans;
    }
}
