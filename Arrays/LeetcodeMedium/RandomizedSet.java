package Arrays.LeetcodeMedium;
import java.util.*;

class RandomizedSet {
    private Map<Integer, Integer> valueIndexMap;
    private List<Integer> values;
    private Random random;

    public RandomizedSet() {
        valueIndexMap = new HashMap<>();
        values = new ArrayList<>();
        random = new Random();
    }


    public boolean insert(int val) {
        if (valueIndexMap.containsKey(val)) {
            return false;
        }
        valueIndexMap.put(val, values.size());
        values.add(val);
        return true;
    }


    public boolean remove(int val) {
        if (!valueIndexMap.containsKey(val)) {
            return false;
        }
        int index = valueIndexMap.get(val);
        int lastValue = values.get(values.size() - 1);


        values.set(index, lastValue);
        valueIndexMap.put(lastValue, index);


        values.remove(values.size() - 1);
        valueIndexMap.remove(val);
        return true;
    }


    public int getRandom() {
        int randomIndex = random.nextInt(values.size());
        return values.get(randomIndex);
    }
}


