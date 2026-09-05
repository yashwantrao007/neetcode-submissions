class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        function(nums, ans, new ArrayList<>(), 0);

        return ans;
        
    }
    private void function(int[] nums, List<List<Integer>> ans, List<Integer> temp, int index){
        ans.add(new ArrayList<>(temp));

        for(int i = index; i<nums.length; i++){
            temp.add(nums[i]);
            function(nums, ans,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
