class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b - a);
        for(int a : stones)
            pq.offer(a);

        while(pq.size() > 1)
            pq.offer(pq.poll() - pq.poll());     // Remove first two, and add their difference
        
        return pq.poll();
    }
}