package binary_search.binary_search_1D_array;

public class Lower_Bound_Floor {

    static int findFloor(int[] arr, int x) {

        int i = 0, j = arr.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] <= x) {
                ans = mid;
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Floor of the x is : " + findFloor(new int[]{5, 5, 5, 6, 6, 6, 8, 9, 10}, 7));
    }
}
