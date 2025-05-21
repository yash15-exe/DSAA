class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int end = people.length - 1;
        int start = 0, count = 0;

        while(end>=start){
            if(people[end] + people[start]<=limit){
                start++;
                end--;
                
            }else{
end--;
            }
            count++;
        }
        return count;
    }
}