package Arrays.LeetcodeMedium;

public class MaxVolume {
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
