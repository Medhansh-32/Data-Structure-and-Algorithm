package binary_search.binary_search_2D_Arrays;

public class Median_2d_Array {


    public static int getCount(int matrix[][], int row, int n) {
        int start = 0, end = matrix[0].length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (matrix[row][mid] <= n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end + 1;
    }

    public static int totalMax(int matrix[][], int n) {

        int row = 0;

        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= n) {
                count += getCount(matrix, i, n);
            }
        }
        return count;
    }


    public static int findMedian(int matrix[][], int m, int n) {

        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            start = Math.min(start, matrix[i][0]);
            end = Math.max(end, matrix[i][matrix[0].length - 1]);
        }

        int pivot = (m * n) / 2;
        while (start <= end) {
            int mid = (start + end) / 2;

            int val = totalMax(matrix, mid);


            if (val > pivot) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {8, 9, 11, 12, 13},
                {21, 23, 25, 27, 29}
        };
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = findMedian(matrix, m, n);
        System.out.println("The median element is: " + ans);
    }
}



