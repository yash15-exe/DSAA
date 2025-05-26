class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq = new int[26];

        for (char ch : words[0].toCharArray()) {
            freq[ch - 'a']++;
        }


        for (int i = 1; i < words.length; i++) {
            int[] letterFreq = new int[26];
            for (char ch : words[i].toCharArray()) {
                letterFreq[ch - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                freq[j] = Math.min(freq[j], letterFreq[j]);
            }
        }

        List<String> ans = new ArrayList<>();
        for (int j = 0; j < 26; j++) {
            for (int k = 0; k < freq[j]; k++) {
                ans.add((char) ('a' + j) + "");
            }
        }

        return ans;
    }
}
