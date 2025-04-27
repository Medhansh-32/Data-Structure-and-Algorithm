package arrays.easy;

public class Count_Positive_Negative {

    static public int maximumCount(int[] nums) {

        if (nums.length == 1) {
            return nums[0] == 0 ? 0 : 1;
        }

        int ans = -1, start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < 0) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;

            }
        }
        ans = ans + 1;
        int pos = nums.length;
        start = 0;
        int mid = 0;
        end = nums.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] > 0) {
                pos = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        pos = nums.length - pos;
        return Math.max(pos, ans);
    }

    public static void main(String[] args) {
        System.out.println(maximumCount(new int[]{-2, -1, -1, 1, 2, 3}));
    }
}
