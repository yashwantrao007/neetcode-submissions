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

        if(root == null) return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> treeQ = new ArrayDeque<>();

        treeQ.add(root);

        while(!treeQ.isEmpty()){
            int size = treeQ.size();
            List<Integer> subList = new ArrayList<>();

            for(int i = 0; i<size; i++){
                if(treeQ.peek().left != null) treeQ.add(treeQ.peek().left);
                if(treeQ.peek().right != null) treeQ.add(treeQ.peek().right);

                subList.add(treeQ.poll().val);
            }

            ans.add(subList.get(subList.size()-1));
        }

        return ans;
        
    }
}
