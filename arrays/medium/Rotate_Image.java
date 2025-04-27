package arrays.medium;

import java.util.Arrays;

public class Rotate_Image {

    public static void transpose(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public static void reverse(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int j = matrix.length - 1;
            int k = 0;
            while (k < j) {
                int temp = matrix[i][k];
                matrix[i][k] = matrix[i][j];
                matrix[i][j] = temp;
                k++;
                j--;
            }
        }
    }

    public static void rotate(int[][] matrix) {

        transpose(matrix);
        reverse(matrix);

    }

    public static void main(String[] args) {

        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Before Rotation :");
        Arrays.stream(arr).forEach(x -> {
            Arrays.stream(x).forEach(y -> System.out.print(y + " "));
            System.out.println();
        });
        rotate(arr);
        System.out.println("After Rotation :");
        Arrays.stream(arr).forEach(x -> {
            Arrays.stream(x).forEach(y -> System.out.print(y + " "));
            System.out.println();
        });
    }
}
