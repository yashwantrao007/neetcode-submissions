class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> mpp = new HashMap<>();

        int max = 0;

        int[] ans = new int[k];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);


        for(int i = 0; i<nums.length; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
        }
        for(int s : mpp.keySet()){
           pq.offer(new int[]{mpp.get(s),s});
           if(pq.size()>k) pq.poll();
        }

        for(int i = 0; i<k;i++){
            ans[i] = pq.poll()[1];
        }

        return ans;
        
    }
}
