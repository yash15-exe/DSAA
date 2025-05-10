class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long c1 = 0, c2 = 0, sum1 = 0, sum2 = 0;
        for(int i: nums1){
            sum1+=i;
            if(i == 0){c1++;
            sum1+=1;
            }
        }
        for(int i: nums2){
            sum2+=i;
            if(i == 0){c2++;
            sum2+=1;
            }
        }
        if(sum1 == sum2)return sum1;
        long minimumSum = Math.min(sum1, sum2);
        if(sum1 == minimumSum){
            if(c1 == 0)return -1;
            return sum2 ;
        }else{
            if(c2 == 0)return -1;
            return sum1 ;
        }
        
    }
}