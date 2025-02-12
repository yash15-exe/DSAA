package DS.Arrays;

public class MatrixSearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (target == anInt) return true;
            }
        }
        return false;
    }
}
