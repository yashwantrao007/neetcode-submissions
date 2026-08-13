class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] ans = new int[temperatures.length];
        int i = 0;
        Deque<Integer> monoStc = new ArrayDeque<>();

        while(i<temperatures.length){
            while(!monoStc.isEmpty() && temperatures[monoStc.peek()]<temperatures[i]){
                ans[monoStc.peek()] = i-monoStc.pop();
            }

            monoStc.push(i);
            i++;
        }
        return ans;






        
    }
}
