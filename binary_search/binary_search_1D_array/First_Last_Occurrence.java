package binary_search.binary_search_1D_array;

public class First_Last_Occurrence {
    static public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] < target) {
                i = mid + 1;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                first = mid;
                j = mid - 1;

            }
        }
        i = 0;
        j = nums.length - 1;
        int second = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] < target) {
                i = mid + 1;
            } else if (nums[mid] > target) {
                j = mid - 1;
            } else {
                second = mid;
                i = mid + 1;
            }
        }

        return new int[] { first, second };
    }

    public static void main(String[] args) {
        var ans=searchRange(new int[]{1,1,1,1,1,1,2,3,4,4,5,5,5,6,7,8,8,8,8},8);
        System.out.println("First Occurrence : "+ans[0]+" Last Occurrence : "+ans[1]);
    }
}
