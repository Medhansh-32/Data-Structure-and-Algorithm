package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spiral_Matrix {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int top = 0, left = 0, bottom = matrix.length - 1, right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[left][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[][] spiralMatrix = {
                {1, 2, 3, 4},
                {7, 6, 5, 8},
                {9, 10, 11, 12}
        };
        System.out.println("Before Rotation :");
        Arrays.stream(spiralMatrix).forEach(x -> {
            Arrays.stream(x).forEach(y -> System.out.print(y + "  "));
            System.out.println();
        });
        System.out.println();
        spiralOrder(spiralMatrix);
        System.out.println("After Rotation :");
        System.out.println(spiralOrder(spiralMatrix));


    }
}
