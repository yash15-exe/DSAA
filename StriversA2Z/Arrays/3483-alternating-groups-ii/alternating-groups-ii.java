class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length, l = 1, count = 0;
        for(int i = 0; i < n+k-2; i++){
            if(colors[i%n] != colors[(i+1)%n])l++;
            else l = 1;

            if(l >= k)count++;
        }
        return count;
    }
}