class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        Arrays.sort(nums);


        backTrack(nums, ans, tempList, 0);

        return ans;
        
    }
    public void backTrack(int[] nums, List<List<Integer>> ans, List<Integer> temp, int ind){

        ans.add(new ArrayList<>(temp));

        for(int i = ind; i<nums.length; i++){
            if(i>ind && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            backTrack(nums, ans, temp, i+1);
            temp.remove(temp.size()-1);
        }

    }
}
