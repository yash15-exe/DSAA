package DailyQuestions;

import java.util.ArrayList;
import java.util.List;

public class Jan2 {
    public int[] vowelStrings(String[] words, int[][] queries) {
        List<Integer> answer = new ArrayList<>();

        String vowels = "aeiouAEIOU";
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                if (vowels.indexOf(words[i].charAt(0)) != -1 &&
                        vowels.indexOf(words[i].charAt(words[i].length() - 1)) != -1) {
                    answer.add(i);
                }
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}
