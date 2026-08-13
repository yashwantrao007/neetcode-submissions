class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> mpp = new HashMap<Integer,Integer>();

        int[] ans = new int[k];

        for(int i = 0; i<nums.length; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }


        int limit = Math.min(k, mpp.size());
int filled = 0;

for (Map.Entry<Integer,Integer> e : mpp.entrySet()) {
    int key = e.getKey();
    int cnt = e.getValue();

    if (filled < limit) {                 // just fill first
        ans[filled++] = key;
    } else {                              // replace the current smallest-by-count
        int minIdx = 0;
        for (int t = 1; t < limit; t++) {
            if (mpp.get(ans[t]) < mpp.get(ans[minIdx])) minIdx = t;
        }
        if (cnt > mpp.get(ans[minIdx])) {
            ans[minIdx] = key;
        }
    }
}
// 'ans' now has the top-k keys (order not guaranteed)


   return ans;
        
    }
}
