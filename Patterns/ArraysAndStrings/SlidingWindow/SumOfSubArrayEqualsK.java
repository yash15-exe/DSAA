package Patterns.ArraysAndStrings.SlidingWindow;

import java.util.ArrayList;

public class SumOfSubArrayEqualsK {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int l = 0, r = 0, sum = 0;
        while(r<arr.length){
            sum += arr[r];

            while(sum>target&&l<r){
                sum-=arr[l];
                l++;
            }
            if(sum==target){

                list.add(l+1);
                list.add(r+1);
                return list;
            }
            r++;
        }
        list.add(-1);
        return list;
    }
}
