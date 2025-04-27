package binary_search.binary_search_on_ans;

public class Split_Arrays {


    public static int capacity(int nums[], int k, int cap) {

        int part = 1;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + sum <= cap) {
                sum += nums[i];
            } else {
                sum = nums[i];
                part++;
            }
        }
        return part;
    }

    public static int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start <= end) {

            int mid = (start + end) / 2;
            int temp = capacity(nums, k, mid);
            if (temp == k) {
                end = mid - 1;
            } else if (temp < k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println("Largest sum is : " + splitArray(new int[]{7, 2, 5, 10, 8}, 2));

    }

}
