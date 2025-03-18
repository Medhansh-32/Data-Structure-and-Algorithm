package binary_search.binary_search_1D_array;

public class Binary_Search_Rotated_Array {

    static public int search(int[] nums, int target) {

        int i = 0, j = nums.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[i] <= nums[mid]) {
                if (nums[i] <= target && target <= nums[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else {
                if (target <= nums[j] && target >= nums[mid]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Target is at : "+search(new int[]{4,5,6,7,0,1,2},0));
    }

}
