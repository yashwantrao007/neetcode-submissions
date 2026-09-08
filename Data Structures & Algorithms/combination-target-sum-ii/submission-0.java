class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        function(candidates, target, ans, 0, 0, new ArrayList<>());

        return ans;
        
    }
    public void function(int[] candidates, int target, List<List<Integer>> ans,
     int index, int sum, List<Integer> tempList){

        if(sum == target){
            ans.add(new ArrayList<>(tempList));
        }

        if(sum>target) return;

        for(int i = index; i<candidates.length; i++){
            if(i>index && candidates[i] == candidates[i-1]) continue;
            tempList.add(candidates[i]);
            function(candidates,target, ans, i+1, sum+candidates[i], tempList);
            tempList.remove(tempList.size()-1);
        }

    }
}
