class Solution {
    public void setZeroes(int[][] matrix) {
        //better solution....not sooo brute
        // Set <Integer> rows = new HashSet<>();
        // Set <Integer> columns = new HashSet<>();

        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[i].length; j++){
        //         if(matrix[i][j] == 0){
        //             rows.add(i);
        //             columns.add(j);
        //         }
        //     }
        // }
        // for(int row: rows){
        //     for(int col = 0; col < matrix[row].length; col ++){
        //         matrix[row][col] = 0;
        //     }
        // }
        // for(int column: columns){
        //     for(int row = 0; row < matrix.length; row ++){
        //         matrix[row][column] = 0;
        //     }
        // }

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0; 
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < cols; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRowHasZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstColHasZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}