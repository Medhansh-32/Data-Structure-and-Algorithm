package arrays.easy;

import java.util.Arrays;

public class Move_Zeros {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                break;
            }
        }
        for (j = i; j < nums.length; j++) {
            if (nums[j] != 0) {
                break;
            }
        }
        while (j < nums.length) {
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 2, 3, 0, 4, 0};
        moveZeroes(nums);
        Arrays.stream(nums).forEach(x -> System.out.print(x + " "));
    }
}
