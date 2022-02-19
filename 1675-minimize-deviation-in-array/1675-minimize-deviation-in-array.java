class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        
        int min = Integer.MAX_VALUE;
        for(int i:nums){
            // Multiply odd numbers with 2 to make all the numbers even
            if(i%2 == 1) i *= 2;
            min = Math.min(min,i);
            pq.add(i);
        }
        // All the elements are even and sorted desc now, and value of min is the minimum of them (last)
        // System.out.println(pq);
        int diff = Integer.MAX_VALUE;
        // While the top element is even
        while(pq.peek() % 2 == 0){
            
            // first element will be maximum in pq
            int max = pq.remove();
            
            diff = Math.min(diff, max-min);
            min = Math.min(max/2, min);
            pq.add(max/2);
            // System.out.println("Updated queue: " + pq);
        }
        
        return Math.min(diff,pq.peek()-min);
    }
}