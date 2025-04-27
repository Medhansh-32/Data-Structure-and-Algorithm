package arrays.easy;

public class Longest_Subarray_with_Zero_Sum_K_Optimal {

    public static int longestSubArray(int arr[], int k) {

        int i = 0, j = 0, sum = 0, maxLen = 0;

        while (j < arr.length) {
            sum += arr[j];
            while (sum > k && i <= j) {
                sum -= arr[i];
                i++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }
            j++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestSubArray(new int[]{1, 2, 3, 1, 1, 1, 0, 4, 2}, 6));
        System.out.println(longestSubArray(new int[]{10, 5, 2, 0, 7, 1, 5, 0}, 15));
    }
}
