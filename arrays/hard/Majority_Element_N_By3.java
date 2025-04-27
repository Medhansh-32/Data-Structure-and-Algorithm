package arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class Majority_Element_N_By3 {
    static public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0, el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && el2 != nums[i]) {
                el1 = nums[i];
                count1 = 1;
            } else if (count2 == 0 && el1 != nums[i]) {
                el2 = nums[i];
                count2 = 1;
            } else if (el1 == nums[i]) {
                count1++;
            } else if (el2 == nums[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el1) {
                count1++;
            } else if (nums[i] == el2) {
                count2++;
            } else {

            }
        }
        List<Integer> ans = new ArrayList<>();
        int max = (nums.length / 3) + 1;
        if (count1 >= max) {
            ans.add(el1);
        }
        if (count2 >= max) {
            ans.add(el2);
        }

        return ans;
    }

    public static void main(String[] args) {
        majorityElement(new int[]{0, -1, 2, -1}).forEach(x -> System.out.println(x));
    }
}
