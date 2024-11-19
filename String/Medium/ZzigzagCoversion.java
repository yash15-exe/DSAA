package String.Medium;
import java.util.*;
public class ZzigzagCoversion {
    public String convertBrute(String s, int numRows) {
        StringBuilder answer = new StringBuilder();
        Map<Integer, List<Character>> newMap = new HashMap<>();

        for (int j = 1; j <= numRows; j++) {
            newMap.put(j, new ArrayList<>());
        }

        int i = 0;
        boolean reverse = false;

        while (i < s.length()) {
            if (!reverse) {
                for (int j = 1; j <= numRows && i < s.length(); j++) {
                    newMap.get(j).add(s.charAt(i));
                    i++;
                }
                reverse = true;
            } else {
                for (int j = numRows - 1; j >= 2 && i < s.length(); j--) {
                    newMap.get(j).add(s.charAt(i));
                    i++;
                }
                reverse = false;
            }
        }

        for (int k = 1; k <= numRows; k++) {
            List<Character> list = newMap.get(k);
            for (char c : list) {
                answer.append(c);
            }
        }

        return answer.toString();
    }
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i = 0; i<numRows;i++){
            rows[i] = new StringBuilder();
        }
        int index = 0;
        boolean down = true;
        for(char c: s.toCharArray()){
            rows[index].append(c);

            if(index==numRows-1){
                down = false;
            }
            if(index ==0){
                down = true;
            }

            index = down ? index+1 : index-1;
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            answer.append(rows[i]);
        }
        return answer.toString();
    }
}
