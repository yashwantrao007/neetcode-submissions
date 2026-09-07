class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        function(nums, ans, new ArrayList<>(), 0, target,0);

        return ans;
        
    }

    public void function(int[] nums, List<List<Integer>> ans, List<Integer> currentEl, int index, int target, int sum){

        if(sum == target){
            ans.add(new ArrayList<>(currentEl));
            return;
        }

        if(sum>target) return;

        for(int i = index; i<nums.length; i++){
            currentEl.add(nums[i]);
            function(nums, ans, currentEl, i, target, sum+nums[i]);
            currentEl.remove(currentEl.size()-1);
        }
    }
}
