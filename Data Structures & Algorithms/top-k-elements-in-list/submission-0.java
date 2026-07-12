class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : count.keySet()) {
            int frequency = count.get(n);
            freq[frequency].add(n);
        }
        
        int[] res = new int[k];
        int idx = 0;
        for (int i = freq.length - 1; i > 0; i--) {
            for (int n : freq[i]) {
                res[idx++] = n;
                if (idx == k) {
                    return res;
                }
            }
        }
        return res;

    }
}
