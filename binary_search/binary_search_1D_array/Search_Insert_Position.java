package binary_search.binary_search_1D_array;

public class Search_Insert_Position {

    static public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int index = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] < target) {
                i = mid + 1;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 4));
    }
}
