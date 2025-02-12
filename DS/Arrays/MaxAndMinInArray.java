package DS.Arrays;

import javafx.util.Pair;

public class MaxAndMinInArray {

    public Pair<Integer, Integer> getMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i: arr){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        return new Pair<>(min, max);
    }
}
