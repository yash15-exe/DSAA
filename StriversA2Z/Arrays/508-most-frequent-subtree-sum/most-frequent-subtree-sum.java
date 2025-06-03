class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        computeSubtreeSum(root, freqMap);

        int maxFreq = 0;
        for (int freq : freqMap.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                result.add(entry.getKey());
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    private int computeSubtreeSum(TreeNode node, Map<Integer, Integer> map) {
        if (node == null) return 0;

        int left = computeSubtreeSum(node.left, map);
        int right = computeSubtreeSum(node.right, map);
        int total = node.val + left + right;

        map.put(total, map.getOrDefault(total, 0) + 1);
        return total;
    }
}
