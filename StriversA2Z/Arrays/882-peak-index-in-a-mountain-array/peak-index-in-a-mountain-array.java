class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int prev = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < prev)return i - 1;
            prev = arr[i];
        }
        return -1;
    }
}