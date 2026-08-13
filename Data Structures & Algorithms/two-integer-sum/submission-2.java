class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> mpp = new HashMap<>();
        int[] ans = new int[2];

        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];

            if(mpp.containsKey(complement)){
                ans[0] = mpp.get(complement);
                ans[1] = i;
            }

            mpp.put(nums[i],i);
        }


        return ans;
        
    }
}
