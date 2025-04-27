package binary_search.binary_search_2D_Arrays;

public class Row_With_Max_1 {

    public static int getRowCount(int arr[][], int i) {

        int start = 0, end = arr[0].length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[i][mid] == 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr[0].length - start;
    }


    public static int getMaxRow(int arr[][]) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = getRowCount(arr, i);
            if (count > max) {
                max = count;
                index = i;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        System.out.println(getMaxRow(new int[][]{{0, 1}, {0, 1}, {0, 0}}));
    }
}
