package arrays.easy;

public class Sorted_Rotated {
    public static void rotateUtil(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int nums[], int i) {
        rotateUtil(nums, 0, i);
        rotateUtil(nums, i + 1, nums.length - 1);
        rotateUtil(nums, 0, nums.length - 1);
    }

    public static boolean check(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                rotate(nums, i);
                break;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check(new int[]{3, 4, 5, 1, 2}));

    }
}
