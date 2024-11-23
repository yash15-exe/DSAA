package Arrays;

import java.util.*;

class Solution {
//    public int maxArea(int[] height) {
//        int maxOutput = 0;
//        for(int i = 0;i<height.length;i++){
//            for(int j = height.length-1; j>=0; j--){
//                int output = (j-i)*Math.min(height[i],height[j]);
//                if(output>maxOutput){
//                    maxOutput=output;
//                }
//            }
//        }
//        return maxOutput;
//
//    }
public boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> map = new HashMap<>();
    for(char ch: magazine.toCharArray()){
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,map.get(ch));
        }
    }
    for(char ch:ransomNote.toCharArray()){
        if(map.containsKey(ch)&&map.get(ch)==0){
            map.put(ch,map.get(ch)-1);
        }
        else{
            return false;
        }
    }
    return true;
    }

}





