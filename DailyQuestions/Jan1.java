package DailyQuestions;

public class Jan1 {
    public int maxScore(String s) {
        int maxScore = 0;
        int score = 0;
        int rightOnes = 0;
        int leftZeros = 0;
        int totalOnes = 0;
        int n = s.length();
        for(char c : s.toCharArray()){
            if(c=='1')totalOnes++;
        }
        rightOnes = totalOnes;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }


            score = leftZeros + rightOnes;
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;

    }
}
