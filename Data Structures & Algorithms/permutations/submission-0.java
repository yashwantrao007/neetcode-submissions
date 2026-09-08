class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        permute(ans, nums, 0);

        return ans;
        
    }
    public void permute(List<List<Integer>> ans, int[] nums, int ind){
        //base
        if(ind == nums.length){
            List<Integer> permution = new ArrayList<>();
            for(int num : nums) permution.add(num);
            ans.add(permution);
            return;
        }

        for(int j = ind; j<nums.length; j++){
            swap(j, ind, nums);
            permute(ans, nums, ind+1);
            swap(j, ind, nums);
        }
    }

    public void swap(int j , int i , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
