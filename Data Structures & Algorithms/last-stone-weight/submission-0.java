class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->b-a);

        for(int i=0; i<stones.length;i++){
            minHeap.add(stones[i]);
        }

        while(minHeap.size()>1){
            minHeap.add(minHeap.poll() - minHeap.poll());
        }
        

        return minHeap.isEmpty()?0: minHeap.peek();
        
    }
}
