package arrays.medium;

public class Majority_Element {

    public static int majorityElement(int[] nums) {
        int majorityElement = 0, count = 0;
        majorityElement = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majorityElement = nums[i];
            }

            if (nums[i] == majorityElement) {
                count++;
            } else {
                count--;
            }

        }
        return majorityElement;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));
    }
}
