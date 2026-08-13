class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int maxLen = 0;

        for(int s: set){

            if(!set.contains(s-1)){
                int count = 1;
              while(set.contains(s+count)){
              count++;
            }
            maxLen = Math.max(maxLen,count);
         }
        }
        return maxLen;
        
    }
}
