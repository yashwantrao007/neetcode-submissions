class Solution {
    public int leastInterval(char[] tasks, int n) {

        int charFreq[] = new int[26];

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);

        //step1 - count freq
        for(int i = 0; i<tasks.length; i++){
            charFreq[tasks[i]-'A']++;
        }

        //step 2- inesrt all non zero freq into Maxheap
        for(int i = 0; i<26; i++){
            if(charFreq[i]>0){
                maxHeap.add(charFreq[i]);
            }
        }

        //total Time required

        int ans = 0;

        //step 3-conntiunue scheduleing
        while(!maxHeap.isEmpty()){
            int taskCycle = 0;

            int cycle = n+1;

            //Temp list to store remaining tasks

            ArrayList<Integer> list = new ArrayList<>();

            //step 4 - execute up t0 n+1
            while(cycle>0 && !maxHeap.isEmpty()){
                int currTask = maxHeap.poll();

                if(currTask>1){
                    list.add(currTask-1);
                }

                taskCycle++;
                cycle--;
            }

            //step 5 - reinsset remaining taks
            for(int ele : list){
                maxHeap.add(ele);
            }

            ans += maxHeap.isEmpty()?taskCycle:n+1;
        }

        return ans;
        
    }
}
