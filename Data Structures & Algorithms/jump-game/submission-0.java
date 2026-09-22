class Solution {
    public boolean canJump(int[] nums) {

        int MaxInd = 0;

        for(int i = 0; i<nums.length; i++){
            if(MaxInd<i){
                return false;
            }

            MaxInd = Math.max(MaxInd, i+nums[i]);
        }

        return true;
        
    }
}
