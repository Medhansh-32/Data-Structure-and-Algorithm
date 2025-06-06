package arrays.medium;

import java.util.Arrays;

public class Rearrange_Array {

    public static int[] rearrangeArray(int[] nums) {

        int ans[] = new int[nums.length];
        int p = 0;
        int n = 1;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[p] = nums[i];
                p += 2;
            } else {
                ans[n] = nums[i];
                n += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Arrays.stream(rearrangeArray(new int[]{3, 1, -2, -5, 2, -4})).forEach(x -> System.out.print(x + " "));
    }
}
