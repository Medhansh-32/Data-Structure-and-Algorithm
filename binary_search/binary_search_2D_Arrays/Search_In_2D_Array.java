package binary_search.binary_search_2D_Arrays;

public class Search_In_2D_Array {


    public static boolean findNumberBetterApproach(int matrix[][], int target, int row) {
        int start = 0;
        int end = matrix[0].length - 1;

        int mid = (start + end) / 2;

        while (start <= end) {
            if (matrix[row][mid] < target) {
                start = mid + 1;
            } else if (matrix[row][mid] > target) {
                end = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }



    public static boolean searchMatrix(int[][] matrix, int target) {

        //             for(int i=0;i<matrix.length;i++){
        //                 if(findNumber(matrix,target,i)==true){
        //                     return true;
        //                 }else{
        //                     continue;
        //                 }
        //             }

        //    return false;


        //Optimal Approach


        int start = 0, end = matrix[0].length * matrix.length - 1;
        int rowSize=matrix[0].length;
        while (start <= end) {
            int mid = (start + end) / 2;

            int value = matrix[mid/rowSize][mid%rowSize];
            if (value == target) {
                return true;

            } else if (value < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }

        return false;

    }

    public static void main(String[] args) {

        int target=11;

        int matrix[][]=new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println("%d is Present : %b".formatted(target,searchMatrix(matrix,target)));

        target=8;
        System.out.println("%d is Present : %b".formatted(target,searchMatrix(matrix,target)));
    }
}
