package binary_search.binary_search_1D_array;

public class Binary_Search {
    static public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
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
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("target is at : " + search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }
}
