class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
    //    for(int i = 0; i < queries.length; i++){
    //     for(int j = queries[i][0]; j <= queries[i][1]; j++){
    //         nums[j]--;
    //     }
    //    }
    //    for(int num: nums){
    //     if(num > 0) return false;
    //    }
    //    return true;

    //Line Sweep Method........

    int[] diff = new int[nums.length + 1];

    for(int[] query: queries){
        diff[query[0]]++;
        diff[query[1]+1]--;
    }
    for(int i = 1; i < diff.length; i++){
        diff[i] += diff[i - 1];
    }
    for(int i = 0; i < nums.length; i++){
        if(nums[i]>diff[i])return false;
    }
    return true;
    }
}