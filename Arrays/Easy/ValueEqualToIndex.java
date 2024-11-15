package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class ValueEqualToIndex {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i)==i+1){
                answer.add(i);
            }
        }
        return answer;
    }
}
