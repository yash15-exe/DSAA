class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Set<String> set = new HashSet<>();
        set.add("0 , 0");
        for(char ch: path.toCharArray()){
            if(ch == 'N')y++;
            if(ch == 'S')y--;
            if(ch == 'E')x--;
            if(ch == 'W')x++;
            String cordinates = x + " , "+ y;

            if(set.contains(cordinates))return true;
            else set.add(cordinates);
        }
        return false;

    }
}