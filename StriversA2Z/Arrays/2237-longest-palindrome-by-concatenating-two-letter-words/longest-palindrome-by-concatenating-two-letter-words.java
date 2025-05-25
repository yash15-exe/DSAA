class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int length = 0;
        boolean centralPalindromeUsed = false;

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : map.keySet()) {
            String reverse = "" + word.charAt(1) + word.charAt(0);
            if (!word.equals(reverse)) {
                if (map.containsKey(reverse)) {
                    int pairCount = Math.min(map.get(word), map.get(reverse));
                    length += pairCount * 4;
                    map.put(word, map.get(word) - pairCount);
                    map.put(reverse, map.get(reverse) - pairCount);
                }
            }
        }

        for (String word : map.keySet()) {
            if (word.charAt(0) == word.charAt(1)) {
                int count = map.get(word);
                if (count >= 2) {
                    length += (count / 2) * 4;
                    map.put(word, count % 2);
                }
            }
        }


        for (String word : map.keySet()) {
            if (word.charAt(0) == word.charAt(1) && map.get(word) > 0 && !centralPalindromeUsed) {
                length += 2;
                centralPalindromeUsed = true;
                break;
            }
        }

        return length;
    }
}
