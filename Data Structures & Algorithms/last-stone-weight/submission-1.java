class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) {
            pq.add(s);
        }
        while (pq.size() > 1) {
            int biggest = pq.poll();
            int biggest2 = pq.poll();
            if (biggest > biggest2) {
                pq.add(biggest - biggest2);
            }
        }
        if (!pq.isEmpty()) {
            return pq.poll();
        }
        else return 0;
        
    }
}
