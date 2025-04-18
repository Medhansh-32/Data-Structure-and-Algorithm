package binary_search.binary_search_2D_Arrays;

public class Peak_Element {
    public static int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0;
        int right = cols - 1;

        while (left <= right) {
            int midCol = left + (right - left) / 2;
            int maxRow = findMaxInColumn(mat, midCol);

            boolean leftIsBigger = midCol - 1 >= 0 && mat[maxRow][midCol - 1] > mat[maxRow][midCol];
            boolean rightIsBigger = midCol + 1 < cols && mat[maxRow][midCol + 1] > mat[maxRow][midCol];

            if (!leftIsBigger && !rightIsBigger) {
                return new int[]{maxRow, midCol}; // Peak found
            } else if (leftIsBigger) {
                right = midCol - 1; // Move left
            } else {
                left = midCol + 1; // Move right
            }
        }

        return new int[]{-1, -1}; // No peak found (shouldn't happen)
    }

    private static int findMaxInColumn(int[][] mat, int col) {
        int maxRow = 0;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] > mat[maxRow][col]) {
                maxRow = i;
            }
        }
        return maxRow;
    }

    // Example usage
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 8, 10, 10},
                {14, 13, 12, 11},
                {15, 9, 11, 21},
                {16, 17, 19, 20}
        };

        int[] peak = findPeakGrid(matrix);
        System.out.println("Peak found at: (" + peak[0] + ", " + peak[1] + ") = " + matrix[peak[0]][peak[1]]);
    }
}
