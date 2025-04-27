package binary_search.binary_search_2D_Arrays;

public class Peak_Element {

    public static int max(int[][] mat, int col) {
        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] > max) {
                index = i;
                max = mat[i][col];
            }

        }
        return index;
    }

    public static int[] findPeakGrid(int[][] mat) {

        int row1 = max(mat, 0);
        if (mat[0].length == 1) {
            return new int[]{max(mat, 0), 0};
        }

        if (mat[row1][0] > mat[row1][1]) {
            return new int[]{row1, 0};
        }
        int row2 = max(mat, mat[0].length - 1);
        if (mat[row2][mat[0].length - 1] > mat[row2][mat[0].length - 2]) {
            return new int[]{row2, mat[0].length - 1};
        }

        int start = 1, end = mat[0].length - 2;

        while (start <= end) {

            int col = (start + end) / 2;

            int row = max(mat, col);

            int val = mat[row][col];

            if (val > mat[row][col - 1] && val > mat[row][col + 1]) {
                return new int[]{row, col};
            } else if (val < mat[row][col - 1]) {
                end = col - 1;
            } else {
                start = col + 1;
            }
        }

        return new int[]{-1, -1};
    }

    // Example usage
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 8, 10, 10},
                {14, 13, 12, 11},
                {15, 90, 11, 1},
                {16, 17, 19, 2}
        };

        int[] peak = findPeakGrid(matrix);
        System.out.println("Peak found at: (" + peak[0] + ", " + peak[1] + ") = " + matrix[peak[0]][peak[1]]);
    }
}
