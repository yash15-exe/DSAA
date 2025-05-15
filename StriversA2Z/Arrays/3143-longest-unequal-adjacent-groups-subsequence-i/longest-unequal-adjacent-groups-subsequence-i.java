class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        if (n == 0) return ans;

        ans.add(words[0]);
        int prevGroup = groups[0];

        for (int i = 1; i < n; i++) {
            if (groups[i] != prevGroup) {
                ans.add(words[i]);
                prevGroup = groups[i];
            }
        }

        return ans;
    }
}
