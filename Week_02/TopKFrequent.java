public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> countMap = new HashMap<>();
        for(int n : nums) {
            countMap.compute(n, (key,v) -> v == null? 1:v+1);
        }
       
        PriorityQueue<Integer> heap =
                new PriorityQueue<Integer>((n1, n2) -> countMap.get(n1) - countMap.get(n2));

        for (int n: countMap.keySet()) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }

        int[] top_k = new int[k];
        while (!heap.isEmpty()) {
            top_k[--k] = heap.poll();
        }
        return top_k;
    }
}
