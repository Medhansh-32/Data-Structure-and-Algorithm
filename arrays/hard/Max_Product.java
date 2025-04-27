package arrays.hard;

public class Max_Product {

    static public int maxProduct(int[] nums) {

        int pre = 1, suf = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (suf == 0) suf = 1;
            if (pre == 0) pre = 1;
            pre *= nums[i];
            suf *= nums[nums.length - i - 1];
            max = Math.max(max, Math.max(pre, suf));
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max-Product : " + maxProduct(new int[]{1, 5, -7, 8, -2, 1, -4, 3}));
    }
}
