package Arrays;

import java.util.*;

class Solution {
    Map<Integer, Integer> randomSet;
    Integer currentIndex;
    public Solution() {
        randomSet = new HashMap<>();
        currentIndex = 0;
    }

    public boolean insert(int val) {
        boolean contains = !randomSet.containsValue(val);
        randomSet.put(currentIndex,val);
        currentIndex++;
        return contains;
    }

    public boolean remove(int val) {
        if(randomSet.containsValue(val)){
            randomSet.remove()
            return true;
        }
        return randomSet.remove(val);
    }

    public int getRandom() {
       randomSet.
    }
}





