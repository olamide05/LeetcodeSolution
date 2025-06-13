public class TopKfreq {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));
        for (int num : frequencyMap.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] result = new int[k];

        for (int i = k-1; i >=0; i--) {
            result[i] = heap.poll();
        }
        //return result;

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int k = 2;
        System.out.println(topKFrequent(nums,k));
    }
}


