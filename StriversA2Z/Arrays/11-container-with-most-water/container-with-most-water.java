class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxOutput = 0;

        while(i<j){
            if(Math.min(height[i], height[j])*(j-i)>maxOutput) maxOutput=Math.min(height[i], height[j])*(j-i);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxOutput;

    }
}