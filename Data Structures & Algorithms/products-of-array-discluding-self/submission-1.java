class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];

        int product = 1;
        int zeroCount = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                product*=nums[i];
            }else{
                zeroCount++;
            }
            
        }
        
        for(int j = 0; j<nums.length; j++){

            if(zeroCount >1){
                ans[j] = 0;
            }

            else if(zeroCount == 1){

                ans[j] = nums[j] == 0 ? product : 0;

            }else{
                ans[j] = product/nums[j];
            }
            
        }

        return ans; 

    }
}  
