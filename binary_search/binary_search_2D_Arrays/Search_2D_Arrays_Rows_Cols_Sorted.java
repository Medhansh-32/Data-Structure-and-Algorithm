package binary_search.binary_search_2D_Arrays;

public class Search_2D_Arrays_Rows_Cols_Sorted {
    public static int[] searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length - 1;


        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 14;

        int pos[] = searchMatrix(matrix, target);
        String ans = pos[0] == -1 ? target + " not present." : "%d is present at row : %d and column : %d".formatted(target, pos[0], pos[1]);
        System.out.println(ans);

        target = 20;

        pos = searchMatrix(matrix, target);
        ans = pos[0] == -1 ? target + " is not present in the matrix." : "%d is present at row : %d and column : %d".formatted(target, pos[0], pos[1]);
        System.out.println(ans);
    }
}
