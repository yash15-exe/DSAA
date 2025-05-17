class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Math.abs(i-j)<=k && nums[j]==key){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}