package arrays.easy;

public class Remove_Duplicates_from_Sorted_Array {

    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                continue;
            } else {
                nums[j] = nums[i + 1];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {

    }
}
