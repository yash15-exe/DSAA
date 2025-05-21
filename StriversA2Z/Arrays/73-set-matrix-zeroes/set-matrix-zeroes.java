class Solution {
    public void setZeroes(int[][] matrix) {
        Set <Integer> rows = new HashSet<>();
        Set <Integer> columns = new HashSet<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for(int row: rows){
            for(int col = 0; col < matrix[row].length; col ++){
                matrix[row][col] = 0;
            }
        }
        for(int column: columns){
            for(int row = 0; row < matrix.length; row ++){
                matrix[row][column] = 0;
            }
        }
    }
}